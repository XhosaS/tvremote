package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acac extends acaa {
    @Override // defpackage.acaa
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        abxd abxdVar = (abxd) obj;
        acab acabVar = abxdVar.unknownFields;
        if (acabVar != acab.a) {
            return acabVar;
        }
        acab acabVar2 = new acab();
        abxdVar.unknownFields = acabVar2;
        return acabVar2;
    }

    @Override // defpackage.acaa
    public final /* synthetic */ Object b() {
        return new acab();
    }

    @Override // defpackage.acaa
    public final /* bridge */ /* synthetic */ void c(Object obj, int i, int i2) {
        ((acab) obj).e((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // defpackage.acaa
    public final /* bridge */ /* synthetic */ void d(Object obj, int i, long j) {
        ((acab) obj).e((i << 3) | 1, Long.valueOf(j));
    }

    @Override // defpackage.acaa
    public final /* bridge */ /* synthetic */ void e(Object obj, int i, Object obj2) {
        ((acab) obj).e((i << 3) | 3, obj2);
    }

    @Override // defpackage.acaa
    public final /* bridge */ /* synthetic */ void f(Object obj, int i, abvo abvoVar) {
        ((acab) obj).e((i << 3) | 2, abvoVar);
    }

    @Override // defpackage.acaa
    public final /* bridge */ /* synthetic */ void g(Object obj, int i, long j) {
        ((acab) obj).e(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.acaa
    public final void h(Object obj) {
        ((abxd) obj).unknownFields.d();
    }

    @Override // defpackage.acaa
    public final /* synthetic */ void j(Object obj) {
        ((acab) obj).d();
    }
}
