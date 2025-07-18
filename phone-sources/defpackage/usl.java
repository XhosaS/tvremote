package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usl extends bl {
    @Override // defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("rpc_config_key");
        String[] stringArray = getArguments().getStringArray("hosts");
        Intent intent = new Intent();
        intent.putExtra("rpc_config_key", parcelableArrayList);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Select host");
        builder.setItems(stringArray, new ifx(this, intent, stringArray, 6));
        builder.setNeutralButton("Clear", new izm(this, intent, 4, null));
        return builder.create();
    }
}
