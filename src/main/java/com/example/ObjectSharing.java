package com.example;

/**
 * Created with IntelliJ IDEA.
 * User: takudo
 * Date: 15/08/12
 * Time: 0:09
 */
public class ObjectSharing {

    private static ObjectSharing singleton = null;

    private ObjectSharing(){

    }

    private Object content;

    public static ObjectSharing getInstance(){

        if(singleton == null){
            singleton = new ObjectSharing();
        }
        return singleton;
    }

    public void setContent(Object content){
        this.content = content;
    }

    public Object getContent() {
        return content;
    }
}
