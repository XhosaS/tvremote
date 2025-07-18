package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.ProgressBar;
import com.google.android.apps.play.movies.mobile.usecase.settings.SettingsActivity;
import com.google.android.videos.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mqf implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    public final SettingsActivity a;
    public final int b;
    public final ksn c;
    public final idy d;
    public final idf e;
    public final lys f;
    public final kwy g;
    private final Executor h;
    private mfb i = mfi.a;
    private final ltp j;

    public mqf(SettingsActivity settingsActivity, int i, ksn ksnVar, lys lysVar, idy idyVar, idf idfVar, kwy kwyVar, ltp ltpVar, Executor executor) {
        this.a = settingsActivity;
        this.b = i;
        this.c = ksnVar;
        this.f = lysVar;
        this.d = idyVar;
        this.e = idfVar;
        this.g = kwyVar;
        this.j = ltpVar;
        this.h = executor;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.i.a();
        this.i = mfi.a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsActivity settingsActivity = this.a;
        settingsActivity.c();
        settingsActivity.m = new Dialog(settingsActivity);
        settingsActivity.m.requestWindowFeature(1);
        settingsActivity.m.getWindow().setBackgroundDrawableResource(R.color.full_transparent);
        Dialog dialog = settingsActivity.m;
        dialog.setContentView(new ProgressBar(dialog.getContext()));
        settingsActivity.m.setOnCancelListener(this);
        settingsActivity.m.show();
        this.i = mjo.e(new lnt(this, 9), new iei(this.j, new ltx(this.c, this.b, System.currentTimeMillis())), this.h);
    }
}
