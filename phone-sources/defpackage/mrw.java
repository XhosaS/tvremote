package defpackage;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.google.android.apps.play.movies.mobile.usecase.watch.StreamingWarningDialogActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrw implements DialogInterface.OnClickListener {
    final /* synthetic */ StreamingWarningDialogActivity a;
    private final SharedPreferences b;

    public mrw(StreamingWarningDialogActivity streamingWarningDialogActivity, SharedPreferences sharedPreferences) {
        this.a = streamingWarningDialogActivity;
        this.b = sharedPreferences;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.edit().putBoolean(krh.WARNING_STREAMING_BANDWIDTH, false).apply();
        this.a.setResult(-1);
    }
}
