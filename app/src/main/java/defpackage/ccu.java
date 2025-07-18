package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccu {
    public static final cct a = new cct();
    public final List b;
    public final List c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ccu() {
        List list = null;
        this(list, list, 15);
    }

    public /* synthetic */ ccu(List list, List list2, int i) {
        list = (i & 1) != 0 ? agrd.a : list;
        agrd agrdVar = (i & 2) != 0 ? agrd.a : null;
        list2 = (i & 4) != 0 ? agrd.a : list2;
        list.getClass();
        agrdVar.getClass();
        list2.getClass();
        this.b = list;
        this.c = list2;
    }
}
