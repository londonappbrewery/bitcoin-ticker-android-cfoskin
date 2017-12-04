package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by cfoskin on 04/12/17.
 */

public class BitcoindataModel {

    private String mAskPrice, mLastPrice;

    public static BitcoindataModel fromJSON(JSONObject jsonObject){
        try{
            BitcoindataModel bitcoindataModel =  new BitcoindataModel();
            bitcoindataModel.mAskPrice = jsonObject.getString("ask");
            bitcoindataModel.mLastPrice = jsonObject.getString("last");
            return bitcoindataModel;

        } catch(JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getAsk() {
        return mAskPrice;
    }

    public void setAsk(String askPrice) {
        mAskPrice = askPrice;
    }

    public String getLastPrice() {
        return mLastPrice;
    }

    public void setLastPrice(String lastPrice) {
        mLastPrice = lastPrice;
    }
}
