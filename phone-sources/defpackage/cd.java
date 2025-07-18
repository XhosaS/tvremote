package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cd<H> extends ca {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final cr e = new cr();

    public cd(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.ca
    public View a(int i) {
        throw null;
    }

    @Override // defpackage.ca
    public boolean b() {
        throw null;
    }

    public LayoutInflater c() {
        throw null;
    }

    public abstract Object d();

    public void e() {
        throw null;
    }

    public boolean f(String str) {
        throw null;
    }

    public void h(PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    public final void i(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.c.startActivity(intent, bundle);
    }
}
