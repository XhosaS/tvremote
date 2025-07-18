package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpb {
    public static final jc a;

    static {
        float[] fArr = box.a;
        bpi bpiVar = box.e;
        int i = bpiVar.c;
        boy boyVar = new boy(bpiVar);
        bpi bpiVar2 = box.e;
        int i2 = bpiVar2.c;
        bov bovVar = box.x;
        int i3 = i2 | (bovVar.c << 6);
        bpa bpaVar = new bpa(bpiVar2, bovVar, 0);
        bov bovVar2 = box.x;
        int i4 = bovVar2.c;
        bpi bpiVar3 = box.e;
        int i5 = i4 | (bpiVar3.c << 6);
        bpa bpaVar2 = new bpa(bovVar2, bpiVar3, 0);
        jc jcVar = jd.a;
        jc jcVar2 = new jc((byte[]) null);
        jcVar2.f(i | (i << 6), boyVar);
        jcVar2.f(i3, bpaVar);
        jcVar2.f(i5, bpaVar2);
        a = jcVar2;
    }
}
