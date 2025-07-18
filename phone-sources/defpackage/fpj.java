package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fpj implements fqo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fpj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [fqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fqo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [fqo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fqo
    public final Object a(foo fooVar, final fnw fnwVar, final int i) {
        final int i2 = 0;
        switch (this.b) {
            case 0:
                return fooVar.g(fnwVar, this.a);
            case 1:
                if (fooVar.s()) {
                    return uhl.a;
                }
                this.a.a(fooVar.q, fnwVar);
                fnl.W(fnwVar, i, new fra(0));
                return uhl.a;
            case 2:
                return fooVar.g(fnwVar, ImmutableList.of(this.a));
            case 3:
                return fooVar.g(fnwVar, ImmutableList.of(this.a));
            case 4:
                return fooVar.g(fnwVar, this.a);
            case 5:
                return fooVar.g(fnwVar, this.a);
            case 6:
                return fooVar.g(fnwVar, ImmutableList.of(this.a));
            case 7:
                return fnl.c((fnq) fooVar, fnwVar, i, this.a, new ecq() { // from class: fqb
                    @Override // defpackage.ecq
                    public final void a(Object obj) {
                        if (i2 != 0) {
                            int i3 = i;
                            fnl.t(fnwVar, i3, (uhp) obj);
                        } else {
                            int i4 = i;
                            fnl.s(fnwVar, i4, (uhp) obj);
                        }
                    }
                });
            default:
                final int i3 = 1;
                return fnl.c(fooVar, fnwVar, i, this.a, new ecq() { // from class: fqb
                    @Override // defpackage.ecq
                    public final void a(Object obj) {
                        if (i3 != 0) {
                            int i32 = i;
                            fnl.t(fnwVar, i32, (uhp) obj);
                        } else {
                            int i4 = i;
                            fnl.s(fnwVar, i4, (uhp) obj);
                        }
                    }
                });
        }
    }
}
