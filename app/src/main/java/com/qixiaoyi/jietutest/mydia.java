package com.qixiaoyi.jietutest;

import android.app.Activity;

/**
 * --------------------------------------------------
 * 版       权 ：易成勇
 * <p>
 * 作       者： 易成勇
 * <p>
 * 文件名：mydia
 * <p>
 * 创 建 日 期 ： 2016/12/6 0006  21:11
 * <p>
 * 描      述 ：
 * <p>
 * <p>
 * 修 订 历 史:
 * <p>
 * --------------------------------------------------
 */

public class mydia extends BlurDialog {
    public mydia(Activity activity) {
        super(activity);
    }

    @Override
    protected void onCreateDialog() {
       setDialogView(R.layout.mydia);
    }
}
