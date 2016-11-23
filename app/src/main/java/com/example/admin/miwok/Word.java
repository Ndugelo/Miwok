package com.example.admin.miwok;

/**
 * Created by admin on 2016/10/20.
 */

public class Word {

    //default translation
    private String mDefaultTranslation;

    //miwook translation
    private String mMiwokTranslation;

    //Audio resource ID for the word
    private int mAudioResourceId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private  static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    //get default trans
    public String getDefaultTranslation(){

        return mDefaultTranslation;
    }

    //get miwok trans
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    // Return the audio resource ID of the word
    public int getAudioResourceId(){ return mAudioResourceId; }
}
