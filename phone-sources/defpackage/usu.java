package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usu extends bl {
    @Override // defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        usp uspVar = (usp) getArguments().getParcelable("rpc_config_key");
        String[] stringArray = getArguments().getStringArray("hosts");
        Intent intent = new Intent();
        intent.putExtra("rpc_config_key", uspVar);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Select host");
        builder.setItems(stringArray, new ifx(this, intent, stringArray, 7));
        builder.setNeutralButton("Clear", new izm(this, intent, 5, null));
        return builder.create();
    }
}
