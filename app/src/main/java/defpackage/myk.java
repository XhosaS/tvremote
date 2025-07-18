package defpackage;

import java.util.BitSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myk extends drn {
    public final mym a;
    private final String[] d;
    private final BitSet e;

    public myk(dru druVar, mym mymVar) {
        super(druVar, mymVar);
        this.d = new String[]{"commandResolver", "conversionContext", "drawableRequester", "logger", "styleRunExtensionConverters", "textType", "typefaceProvider"};
        BitSet bitSet = new BitSet(7);
        this.e = bitSet;
        this.a = mymVar;
        bitSet.clear();
    }

    public final void aa(ofy ofyVar) {
        this.a.z = ofyVar;
        this.e.set(6);
    }

    @Override // defpackage.drn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mym a() {
        j(7, this.e, this.d);
        return this.a;
    }

    public final void c(oaa oaaVar) {
        this.a.b = oaaVar;
        this.e.set(0);
    }

    public final void d(oal oalVar) {
        this.a.c = oalVar;
        this.e.set(1);
    }

    public final void e(obh obhVar) {
        this.a.e = obhVar;
        this.e.set(2);
    }

    public final void f(oco ocoVar) {
        this.a.s = ocoVar;
        this.e.set(3);
    }

    public final void g(Map map) {
        this.a.x = map;
        this.e.set(4);
    }

    public final void h(nmt nmtVar) {
        this.a.y = nmtVar;
        this.e.set(5);
    }
}
