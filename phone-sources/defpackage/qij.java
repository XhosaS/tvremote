package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qij implements qii {
    public static final tvn a = tvn.n("GnpSdk");
    public final Context b;
    public final yow c;
    public final qja d;
    public final qoj e;
    public final String f;
    public final String g;
    public ypc h;
    private final yft i;

    public qij(Context context, yow yowVar, qja qjaVar, qoj qojVar, String str, String str2) {
        qjaVar.getClass();
        qojVar.getClass();
        str2.getClass();
        this.b = context;
        this.c = yowVar;
        this.d = qjaVar;
        this.e = qojVar;
        this.f = str;
        this.g = str2;
        this.i = new yga(new ovo(this, 2));
    }

    public final boolean a() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    public final void b(bhi bhiVar, Activity activity) {
        bhiVar.r(activity, Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("Email", this.f).appendQueryParameter("continue", this.g).build());
    }
}
