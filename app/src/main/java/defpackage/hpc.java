package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.tvsearch.results.searchentity.info.EntityInfo;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hpc extends hkk implements fat {
    boolean a;
    String e;
    private final adyr f;
    private final int g;
    private final int h;
    private final boolean i;
    private final String j;
    private final Account k;
    private xkc l;

    public hpc(int i, adyr adyrVar, int i2, int i3, boolean z, String str, Account account) {
        super(i);
        this.a = false;
        this.e = null;
        this.f = adyrVar;
        this.g = i2;
        this.h = i3;
        this.i = z;
        this.j = str;
        this.k = account;
    }

    @Override // defpackage.hkk
    public final boolean A() {
        adyr adyrVar = this.f;
        if ((adyrVar.b & 128) != 0) {
            adxp adxpVar = adyrVar.i;
            if (adxpVar == null) {
                adxpVar = adxp.a;
            }
            if (adxpVar != null && adxpVar.b.size() > 0 && (((adwq) adxpVar.b.get(0)).b & 8) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hkk
    public final boolean B() {
        if (!dE()) {
            return false;
        }
        adxv adxvVar = this.f.g;
        if (adxvVar == null) {
            adxvVar = adxv.a;
        }
        adxk adxkVar = adxvVar.g;
        if (adxkVar == null) {
            adxkVar = adxk.a;
        }
        adxj adxjVarB = adxj.b(adxkVar.c);
        if (adxjVarB == null) {
            adxjVarB = adxj.DEFAULT;
        }
        return adxjVarB.equals(adxj.MOVIE) || adxjVarB.equals(adxj.TV_SHOW);
    }

    @Override // defpackage.hkk
    public final int C() {
        int iA = adyq.a(this.f.n);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.hkk
    public final int a() {
        adyr adyrVar = this.f;
        if ((adyrVar.b & 128) != 0) {
            adxp adxpVar = adyrVar.i;
            if (adxpVar == null) {
                adxpVar = adxp.a;
            }
            if (adxpVar.c > 0) {
                adxp adxpVar2 = adyrVar.i;
                if (adxpVar2 == null) {
                    adxpVar2 = adxp.a;
                }
                return adxpVar2.c;
            }
        }
        return this.g;
    }

    @Override // defpackage.hkk
    public final int b() {
        adyr adyrVar = this.f;
        if ((adyrVar.b & 128) != 0) {
            adxp adxpVar = adyrVar.i;
            if (adxpVar == null) {
                adxpVar = adxp.a;
            }
            if (adxpVar.d > 0) {
                adxp adxpVar2 = adyrVar.i;
                if (adxpVar2 == null) {
                    adxpVar2 = adxp.a;
                }
                return adxpVar2.d;
            }
        }
        return this.h;
    }

    @Override // defpackage.hkk
    public final int c() {
        return dE() ? 13893 : 13891;
    }

    @Override // defpackage.hkk
    public final Intent d() {
        adyr adyrVar = this.f;
        if ((adyrVar.b & 32) == 0) {
            return null;
        }
        exx exxVar = exx.a;
        adxv adxvVar = adyrVar.g;
        if (adxvVar == null) {
            adxvVar = adxv.a;
        }
        return exxVar.a(adxvVar, this.k);
    }

    @Override // defpackage.fat
    public final xkc dA() throws abxv {
        xkc xkcVar = this.l;
        if (xkcVar != null) {
            return xkcVar;
        }
        adyr adyrVar = this.f;
        if ((adyrVar.b & 131072) != 0) {
            try {
                xjr xjrVar = adyrVar.q;
                if (xjrVar == null) {
                    xjrVar = xjr.a;
                }
                xjp xjpVar = xjrVar.d;
                if (xjpVar == null) {
                    xjpVar = xjp.a;
                }
                abvo abvoVar = xjpVar.d;
                ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                xkc xkcVar2 = xkc.a;
                abvt abvtVarK = abvoVar.k();
                xkc xkcVar3 = new xkc();
                try {
                    try {
                        try {
                            abzj abzjVarA = abza.a.a(xkcVar3.getClass());
                            abzjVarA.i(xkcVar3, abvu.p(abvtVarK), generatedRegistry);
                            abzjVarA.g(xkcVar3);
                            try {
                                abvtVarK.z(0);
                                Byte b = (byte) 1;
                                b.getClass();
                                this.l = xkcVar3;
                            } catch (abxv e) {
                                throw e;
                            }
                        } catch (abxv e2) {
                            if (e2.a) {
                                throw new abxv(e2);
                            }
                            throw e2;
                        } catch (IOException e3) {
                            if (e3.getCause() instanceof abxv) {
                                throw ((abxv) e3.getCause());
                            }
                            throw new abxv(e3);
                        }
                    } catch (abzz e4) {
                        throw e4.a();
                    }
                } catch (RuntimeException e5) {
                    if (e5.getCause() instanceof abxv) {
                        throw ((abxv) e5.getCause());
                    }
                    throw e5;
                }
            } catch (abxv unused) {
                this.l = xkc.a;
            }
        } else {
            this.l = xkc.a;
        }
        return this.l;
    }

    @Override // defpackage.fat
    public final /* synthetic */ xmj dB() {
        return xmj.UNKNOWN;
    }

    @Override // defpackage.fat
    public final adxk dC() {
        adxv adxvVar = this.f.g;
        if (adxvVar == null) {
            adxvVar = adxv.a;
        }
        adxk adxkVar = adxvVar.g;
        return adxkVar == null ? adxk.a : adxkVar;
    }

    @Override // defpackage.fat
    public final String dD() {
        adyr adyrVar = this.f;
        if (adyrVar != null) {
            return adyrVar.c;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    @Override // defpackage.fat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dE() {
        /*
            r4 = this;
            adyr r0 = r4.f
            int r1 = r0.b
            r1 = r1 & 32
            r2 = 0
            if (r1 == 0) goto L3b
            adxv r1 = r0.g
            if (r1 != 0) goto Lf
            adxv r1 = defpackage.adxv.a
        Lf:
            int r1 = r1.c
            int r1 = defpackage.adxu.a(r1)
            if (r1 != 0) goto L18
            goto L1b
        L18:
            r3 = 2
            if (r1 == r3) goto L2d
        L1b:
            adxv r1 = r0.g
            if (r1 != 0) goto L21
            adxv r1 = defpackage.adxv.a
        L21:
            int r1 = r1.c
            int r1 = defpackage.adxu.a(r1)
            if (r1 != 0) goto L2a
            goto L3b
        L2a:
            r3 = 3
            if (r1 != r3) goto L3b
        L2d:
            adxv r0 = r0.g
            if (r0 != 0) goto L33
            adxv r0 = defpackage.adxv.a
        L33:
            int r0 = r0.b
            r0 = r0 & 8
            if (r0 == 0) goto L3b
            r0 = 1
            return r0
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpc.dE():boolean");
    }

    @Override // defpackage.fat
    public final /* synthetic */ boolean dF() {
        return false;
    }

    @Override // defpackage.fat
    public final boolean dG() {
        return (this.f.b & 131072) != 0;
    }

    @Override // defpackage.fat
    public final EntityInfo dz() {
        adyf adyfVar;
        adyr adyrVar = this.f;
        String str = adyrVar.d;
        String strQ = q();
        adwo adwoVar = null;
        if ((adyrVar.b & 512) != 0) {
            adyfVar = adyrVar.j;
            if (adyfVar == null) {
                adyfVar = adyf.a;
            }
        } else {
            adyfVar = null;
        }
        if ((adyrVar.b & 4096) != 0 && (adwoVar = adyrVar.l) == null) {
            adwoVar = adwo.a;
        }
        return new EntityInfo(str, strQ, adyfVar, adwoVar, adyrVar.k);
    }

    @Override // defpackage.hkk
    public final Duration e() {
        aeaf aeafVar = this.f.o;
        if (aeafVar == null) {
            aeafVar = aeaf.a;
        }
        return Duration.ofSeconds(aeafVar.b);
    }

    @Override // defpackage.hkk, defpackage.gki
    public final String f() {
        return this.f.d;
    }

    @Override // defpackage.hkk
    public final String g() {
        return this.f.f;
    }

    @Override // defpackage.hkk
    public final boolean h() {
        return (this.f.b & 8) != 0;
    }

    @Override // defpackage.fat
    public final boolean j() {
        adyr adyrVar = this.f;
        if (adyrVar == null || (adyrVar.b & 32) == 0) {
            return false;
        }
        adxv adxvVar = adyrVar.g;
        if (adxvVar == null) {
            adxvVar = adxv.a;
        }
        if ((adxvVar.b & 1) == 0) {
            return false;
        }
        adxv adxvVar2 = adyrVar.g;
        int iA = adxu.a((adxvVar2 == null ? adxv.a : adxvVar2).c);
        if (iA == 0 || iA != 2) {
            return false;
        }
        if (((adxvVar2 == null ? adxv.a : adxvVar2).b & 8) == 0) {
            return false;
        }
        if (adxvVar2 == null) {
            adxvVar2 = adxv.a;
        }
        adxk adxkVar = adxvVar2.g;
        if (adxkVar == null) {
            adxkVar = adxk.a;
        }
        if ((adxkVar.b & 1) == 0) {
            return false;
        }
        adxv adxvVar3 = adyrVar.g;
        if (adxvVar3 == null) {
            adxvVar3 = adxv.a;
        }
        adxk adxkVar2 = adxvVar3.g;
        if (adxkVar2 == null) {
            adxkVar2 = adxk.a;
        }
        adxj adxjVarB = adxj.b(adxkVar2.c);
        if (adxjVarB == null) {
            adxjVarB = adxj.DEFAULT;
        }
        return adxjVarB == adxj.PERSON;
    }

    @Override // defpackage.hkk, defpackage.gki
    public final String k() {
        return z() ? this.e : "";
    }

    @Override // defpackage.hkk, defpackage.gki
    public final String l() {
        return this.j;
    }

    @Override // defpackage.hkk
    public final String q() {
        return this.f.e.replace("\n", " • ");
    }

    @Override // defpackage.hkk
    public final String r() {
        adyr adyrVar = this.f;
        if ((adyrVar.b & 128) != 0) {
            adxp adxpVar = adyrVar.i;
            if (adxpVar == null) {
                adxpVar = adxp.a;
            }
            if (adxpVar != null && adxpVar.b.size() > 0) {
                String str = ((adwq) adxpVar.b.get(0)).d;
                if (!TextUtils.isEmpty(str)) {
                    return "© ".concat(String.valueOf(str));
                }
            }
        }
        return "";
    }

    @Override // defpackage.hkk
    public final String s() {
        return this.f.m;
    }

    @Override // defpackage.hkk
    public final List t() {
        adyr adyrVar = this.f;
        adzo adzoVar = adyrVar.p;
        if (adzoVar == null) {
            adzoVar = adzo.a;
        }
        if ((adyrVar.b & 65536) == 0 || adzoVar.b.size() <= 0) {
            return null;
        }
        return adzoVar.b;
    }

    @Override // defpackage.hkk
    public final List v() {
        return this.f.h;
    }

    @Override // defpackage.hkk
    public final boolean w() {
        return this.i;
    }

    @Override // defpackage.hkk
    public final boolean x() {
        return (this.f.b & 4) != 0;
    }

    @Override // defpackage.hkk
    public final boolean z() {
        if (!this.a) {
            this.a = true;
            adyr adyrVar = this.f;
            if ((adyrVar.b & 1) != 0) {
                String str = adyrVar.c;
                if (!TextUtils.isEmpty(str) && abpt.b(str)) {
                    this.e = str;
                    return true;
                }
            }
            adxv adxvVar = adyrVar.g;
            if (adxvVar == null) {
                adxvVar = adxv.a;
            }
            adxk adxkVar = adxvVar.g;
            if (adxkVar == null) {
                adxkVar = adxk.a;
            }
            if ((adxkVar.b & 2) != 0) {
                adxv adxvVar2 = adyrVar.g;
                if (adxvVar2 == null) {
                    adxvVar2 = adxv.a;
                }
                adxk adxkVar2 = adxvVar2.g;
                if (adxkVar2 == null) {
                    adxkVar2 = adxk.a;
                }
                this.e = adxkVar2.d;
                return true;
            }
        }
        return this.e != null;
    }
}
