package com.amazon.ask.helloworld.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpClient {
    public static String doGet(String httpurl) {
        HttpURLConnection connection = null;
        InputStream is = null;
        BufferedReader br = null;
        String result = null; //返回结果字符串
        try {
            URL url = new URL(httpurl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            //设置连接主机服务器的超时时间
            connection.setConnectTimeout(15000);
            //设置读取远程返回的数据时间
            connection.setReadTimeout(60000);
            //发送请求
            connection.connect();
            if(connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                //存放数据
                StringBuffer sb = new StringBuffer();
                String temp = null;
                while((temp = br.readLine()) != null) {
                    sb.append(temp);
                    sb.append("\r\n");
                }
                result = sb.toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            connection.disconnect();
        }
        return result;
    }

    public static String doPost(String httpurl, String param) {
        HttpURLConnection connection = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedReader br = null;
        String result = null;
        try {
            URL url = new URL(httpurl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            //设置连接主机服务器的超时时间
            connection.setConnectTimeout(15000);
            //设置读取远程返回的数据时间
            connection.setReadTimeout(60000);

            connection.setDoOutput(true);
            connection.setDoInput(true);

            //设置传入参数的格式： 请求参数应该是 name1=value1&name2=value2 格式
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            //可选， 设置鉴权信息 Authorization

            os = connection.getOutputStream();
            // 通过输出流对象将参数写出去/传输出去，通过字节数组写出
            os.write(param.getBytes());

            if(connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                StringBuffer sb = new StringBuffer();
                String temp = null;

                while((temp = br.readLine()) != null) {
                    sb.append(temp);
                    sb.append("\r\n");
                }
                result = sb.toString();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
