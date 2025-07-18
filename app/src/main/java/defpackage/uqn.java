package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uqn {
    public final jyw a;
    public final String b;
    public CopyOnWriteArrayList c;

    public uqn(Context context, String str) {
        this(new jyw(context, str, null), str);
    }

    public uqn(jyw jywVar, String str) {
        this.c = new CopyOnWriteArrayList();
        if (!str.startsWith("STREAMZ_")) {
            throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
        }
        this.a = jywVar;
        this.b = str;
    }
}
