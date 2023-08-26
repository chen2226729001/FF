import org.bouncycastle.util.encoders.Base64;

public abstract class Basa64Coder {
    public final static String ENCODING = "UTF-8";

    /**
     * Basa64编码
     * @param data 待编码数据
     * @return String 编码数据
     * @throws Exception
     */
    public static String encode(String data)throws Exception{
        byte[] b = Base64.encode(data.getBytes(ENCODING));
        return new String(b,ENCODING);
    }

    /**
     * Basa64解码
     * @param data 待解码数据
     * @return String 解码数据
     * @throws Exception
     */
    public static String decode(String data)throws Exception{
        byte[] b = Base64.decode(data.getBytes(ENCODING));
        return new String(b,ENCODING);
    }
}
/*Basa64简单来说就是给出了一张表，使用表中对应的值和字符进行编码
* 主要步骤：
* 1）将字符转换为字符编码2）将字符编码转换为二进制码3)分组  每3个8位二进制转换为四个6位（不足时低位补0）  并在四个六位前面加零补齐4）四个八位对应的值转换为十进制使用表对应
* 5）四个一组如果缺少四个字符则用等号补齐
* 1）A -》 65 -》 01000001 -》010000  010000-》00010000   00010000-》16 16 -》Q Q = =
*
*
* 用在哪些地方
* 1.电子邮件传输
* 2.网络数据传输  HTTP的GET/POST
* 3.密钥存储
* 4.数字证书存储
* 5.OpenSSL的Base64编码
* */