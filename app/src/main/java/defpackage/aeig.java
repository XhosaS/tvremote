package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeig implements aeiz {
    public final bem a;
    public final Context b;
    private volatile aehj c;
    private final Object d = new Object();

    public aeig(Context context, wit witVar) {
        this.a = witVar;
        this.b = context;
    }

    public final bek a(bem bemVar, Context context) {
        return new bek(bemVar, new aeic(context));
    }

    @Override // defpackage.aeiz
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aehj dN() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    bek bekVarA = a(this.a, this.b);
                    agwj agwjVar = agwi.a;
                    this.c = ((aeie) bekVarA.a(new agvq(aeie.class))).a;
                }
            }
        }
        return this.c;
    }

    public aeig(tt ttVar) {
        this.a = ttVar;
        this.b = ttVar;
    }
}
