package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ce extends ca {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final de e = new df();

    public ce(Activity activity, Context context, Handler handler) {
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
        return true;
    }

    public LayoutInflater c() {
        throw null;
    }

    public abstract Object f();

    public void k() {
    }

    public void s(PrintWriter printWriter, String[] strArr) {
    }
}
