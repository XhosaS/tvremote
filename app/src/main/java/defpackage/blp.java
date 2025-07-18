package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blp {
    public final String a;
    public final blh b;
    public final Context c;
    public final ahbt d;
    public int f;
    public bla g;
    public final bln i;
    public final AtomicBoolean e = new AtomicBoolean(true);
    public final ahim h = new ahis();
    public final bkx j = new blm(this);
    public final ServiceConnection k = new blo(this);

    public blp(Context context, String str, blh blhVar) {
        this.a = str;
        this.b = blhVar;
        this.c = context.getApplicationContext();
        this.d = blhVar.a.l();
        this.i = new bln(this, blhVar.b);
    }
}
