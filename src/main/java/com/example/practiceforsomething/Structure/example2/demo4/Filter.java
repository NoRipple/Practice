package com.example.practiceforsomething.Structure.example2.demo4;

import java.io.IOException;

/**
 * Classname: Filter
 * Package: com.example.practiceforsomething.Structure.example2.demo4
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 16:13
 * @Version: v1.0
 */
public abstract class Filter {
    protected Pipe input;
    protected Pipe output;

    public Filter(Pipe input, Pipe output) {
        this.input = input;
        this.output = output;
    }
    protected abstract void transform() throws IOException;
}

