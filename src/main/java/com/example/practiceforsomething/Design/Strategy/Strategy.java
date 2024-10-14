package com.example.practiceforsomething.Design.Strategy;

/**
 * Classname: Strategy
 * Package: com.example.practiceforsomething.Design.Strategy
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 18:29
 * @Version: v1.0
 */
public class Strategy {
    private Encrypt encrypt;

    public void setEncrypt(Encrypt encrypt) {
        this.encrypt = encrypt;
    }

    public void work(String password){
        System.out.println("正在加密" + password);
        encrypt.work();
    }
}
