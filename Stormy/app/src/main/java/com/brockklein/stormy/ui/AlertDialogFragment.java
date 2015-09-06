package com.brockklein.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.brockklein.stormy.R;

/**
 * Created by BrockKlein on 7/5/15.
 */
public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Context context = getActivity();

        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.Error_Title))
                .setMessage(context.getString(R.string.Error_Message))
                .setPositiveButton(context.getString(R.string.Error_OkButton_Text), null);
        AlertDialog dialog = builder.create();
        return dialog;
    }




}
