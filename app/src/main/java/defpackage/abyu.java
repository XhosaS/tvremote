package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyu implements abzj {
    private final MessageLite a;
    private final acaa b;
    private final boolean c;
    private final abwm d;

    public abyu(acaa acaaVar, abwm abwmVar, MessageLite messageLite) {
        this.b = acaaVar;
        this.c = messageLite instanceof abwz;
        this.d = abwmVar;
        this.a = messageLite;
    }

    @Override // defpackage.abzj
    public final int a(Object obj) {
        acab acabVar = ((abxd) obj).unknownFields;
        int iH = acabVar.e;
        if (iH == -1) {
            iH = 0;
            for (int i = 0; i < acabVar.b; i++) {
                int i2 = acabVar.c[i] >>> 3;
                abvo abvoVar = (abvo) acabVar.d[i];
                int iH2 = abvz.H(8);
                int iH3 = abvz.H(16) + abvz.H(i2);
                int iH4 = abvz.H(24);
                int iD = abvoVar.d();
                iH += iH2 + iH2 + iH3 + iH4 + abvz.H(iD) + iD;
            }
            acabVar.e = iH;
        }
        if (!this.c) {
            return iH;
        }
        abwr abwrVar = ((abwz) obj).n;
        abzp abzpVar = abwrVar.b;
        int i3 = abzpVar.b;
        int iC = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            iC += abwrVar.c(abzpVar.d(i4));
        }
        Iterator it = abzpVar.a().iterator();
        while (it.hasNext()) {
            iC += abwrVar.c((Map.Entry) it.next());
        }
        return iH + iC;
    }

    @Override // defpackage.abzj
    public final int b(Object obj) {
        int iHashCode = ((abxd) obj).unknownFields.hashCode();
        return this.c ? (iHashCode * 53) + ((abwz) obj).n.b.hashCode() : iHashCode;
    }

    @Override // defpackage.abzj
    public final Object e() {
        MessageLite messageLite = this.a;
        return messageLite instanceof abxd ? (abxd) ((abxd) messageLite).cM(4, null) : messageLite.cy().w();
    }

    @Override // defpackage.abzj
    public final void g(Object obj) {
        this.b.h(obj);
        this.d.c(obj);
    }

    @Override // defpackage.abzj
    public final void h(Object obj, Object obj2) {
        abzk.r(obj, obj2);
        if (this.c) {
            abzk.n(this.d, obj, obj2);
        }
    }

    @Override // defpackage.abzj
    public final void i(Object obj, abzd abzdVar, ExtensionRegistryLite extensionRegistryLite) {
        boolean zP;
        abwm abwmVar = this.d;
        acaa acaaVar = this.b;
        Object objA = acaaVar.a(obj);
        abwr abwrVarA = abwmVar.a(obj);
        while (abzdVar.c() != Integer.MAX_VALUE) {
            try {
                int i = ((abvu) abzdVar).b;
                if (i != 11) {
                    if ((i & 7) == 2) {
                        abxc abxcVarA = extensionRegistryLite.a(this.a, i >>> 3);
                        if (abxcVarA != null) {
                            abwmVar.d(abzdVar, abxcVarA, extensionRegistryLite, abwrVarA);
                        } else {
                            zP = acaaVar.i(objA, abzdVar, 0);
                        }
                    } else {
                        zP = abzdVar.P();
                    }
                    if (!zP) {
                        break;
                    }
                } else {
                    abxc abxcVarA2 = null;
                    abvo abvoVarO = null;
                    int i2 = 0;
                    while (abzdVar.c() != Integer.MAX_VALUE) {
                        int i3 = ((abvu) abzdVar).b;
                        if (i3 == 16) {
                            i2 = abzdVar.i();
                            abxcVarA2 = extensionRegistryLite.a(this.a, i2);
                        } else if (i3 == 26) {
                            if (abxcVarA2 != null) {
                                abwmVar.d(abzdVar, abxcVarA2, extensionRegistryLite, abwrVarA);
                            } else {
                                abvoVarO = abzdVar.o();
                            }
                        } else if (i3 == 12 || !abzdVar.P()) {
                            break;
                        }
                    }
                    if (((abvu) abzdVar).b != 12) {
                        throw new abxv("Protocol message end-group tag did not match expected tag.");
                    }
                    if (abvoVarO != null) {
                        if (abxcVarA2 != null) {
                            abyq abyqVarCy = abxcVarA2.c.cy();
                            abvt abvtVarK = abvoVarO.k();
                            abyqVarCy.o(abvtVarK, extensionRegistryLite);
                            abwrVarA.m(abxcVarA2.d, abyqVarCy.w());
                            abvtVarK.z(0);
                        } else {
                            acaaVar.f(objA, i2, abvoVarO);
                        }
                    }
                }
            } finally {
                ((abxd) obj).unknownFields = (acab) objA;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd A[EDGE_INSN: B:62:0x00bd->B:36:0x00bd BREAK  A[LOOP:1: B:20:0x006b->B:67:0x006b], SYNTHETIC] */
    @Override // defpackage.abzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.abuz r15) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyu.j(java.lang.Object, byte[], int, int, abuz):void");
    }

    @Override // defpackage.abzj
    public final boolean k(Object obj, Object obj2) {
        if (!((abxd) obj).unknownFields.equals(((abxd) obj2).unknownFields)) {
            return false;
        }
        if (this.c) {
            return ((abwz) obj).n.equals(((abwz) obj2).n);
        }
        return true;
    }

    @Override // defpackage.abzj
    public final boolean l(Object obj) {
        return ((abwz) obj).n.i();
    }

    @Override // defpackage.abzj
    public final void m(Object obj, abwa abwaVar) {
        Iterator itE = ((abwz) obj).n.e();
        while (itE.hasNext()) {
            Map.Entry entry = (Map.Entry) itE.next();
            abxb abxbVar = (abxb) entry.getKey();
            if (abxbVar.c.s != acaq.MESSAGE || abxbVar.d || abxbVar.e) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof abxy) {
                abwaVar.d(abxbVar.b, ((abya) ((abxy) entry).a.getValue()).b());
            } else {
                abwaVar.d(abxbVar.b, entry.getValue());
            }
        }
        acab acabVar = ((abxd) obj).unknownFields;
        for (int i = 0; i < acabVar.b; i++) {
            abwaVar.d(acabVar.c[i] >>> 3, acabVar.d[i]);
        }
    }
}
