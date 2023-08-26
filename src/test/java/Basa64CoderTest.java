import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Basa64编码与解码的测试类
 * @auther chen
 * @version 1.0
 * @since 1.0
 */
public class Basa64CoderTest {
    //测试Basa64编码与解码
    @Test
    public final void test() throws Exception {
        String inputStr = "Java的加密与解密的艺术";
        System.out.println("原文：\t"+inputStr);
        //进行编码
        String code = Basa64Coder.encode(inputStr);
        System.out.println("编码后：\t"+code);
        //进行解码
        String outputStr = Basa64Coder.decode(code);
        System.out.println("解码后：\t"+outputStr);
        //验证解码和编码后的一致性
        assertEquals(inputStr,outputStr);
    }
}
