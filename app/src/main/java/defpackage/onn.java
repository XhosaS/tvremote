package defpackage;

import android.content.Context;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onn {
    public final Context a;
    public final zyg b;
    public final zyg c;
    public final zyg d;
    public Set e;
    public final yyn f = new yyn(4);
    public GellerLoggingCallback g = new onz();
    public final yqt h;
    public yyr i;
    public final Map j;
    public final Map k;
    public final Map l;
    public acdh m;
    public yqt n;

    public onn(Context context, zyg zygVar, zyg zygVar2, zyg zygVar3, Set set) {
        this.e = zcp.b;
        ypv ypvVar = ypv.a;
        this.h = ypvVar;
        this.i = zcl.a;
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = acdh.b;
        this.n = ypvVar;
        this.a = context;
        this.b = zygVar;
        this.c = zygVar2;
        this.d = zygVar3;
        if (set != null) {
            this.e = set;
        }
    }

    public final void a(acgd acgdVar, Map map, yqi yqiVar) {
        this.j.put(acgdVar, new HashMap(map));
        this.k.put(acgdVar, yqiVar);
    }
}
