package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbp extends pbk {
    public final Context a;
    public final zyg b;
    public final agow c;
    public volatile rdr d;
    jyw e;
    jyw f;

    public pbp(Context context, agow agowVar, zyg zygVar) {
        this.a = context;
        this.c = agowVar;
        this.b = zygVar;
    }

    @Override // defpackage.pbk
    public final zyd a(final pbj pbjVar, zyd zydVar) {
        return zud.h(zuz.h(zydVar, new zvi() { // from class: pbm
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                zyd zydVarA;
                final par parVar = (par) obj;
                int i = parVar.b;
                final pbp pbpVar = this.a;
                if (i == 1) {
                    zydVarA = zxn.h(true);
                } else {
                    rdr rdrVar = pbpVar.d;
                    if (rdrVar == null) {
                        synchronized (pbpVar) {
                            rdrVar = pbpVar.d;
                            if (rdrVar == null) {
                                rdrVar = new rdr();
                                pbpVar.d = rdrVar;
                            }
                        }
                    }
                    zydVarA = rdrVar.a(pbpVar.a, ((Boolean) pbpVar.c.a()).booleanValue(), true);
                }
                final pbj pbjVar2 = pbjVar;
                return zuz.h(zydVarA, new zvi() { // from class: pbl
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        if (!((Boolean) obj2).booleanValue()) {
                            return zxy.a;
                        }
                        par parVar2 = parVar;
                        jyw jywVarB = pbpVar.b(parVar2);
                        if (jywVarB == null) {
                            return zxy.a;
                        }
                        pbh pbhVar = (pbh) pbjVar2;
                        jyv jyvVarI = jywVarB.i(pbhVar.b, (kab) yqt.h(null).e(new kab() { // from class: pbo
                            @Override // defpackage.kab
                            public final void a(abvo abvoVar) {
                            }
                        }));
                        jyvVarI.k = pbhVar.a;
                        zlv zlvVar = pbhVar.c;
                        if (zlvVar != null) {
                            jyvVarI.d = zlvVar;
                        }
                        Integer num = pbhVar.d;
                        if (num != null) {
                            aecc aeccVar = jyvVarI.b;
                            int iIntValue = num.intValue();
                            if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                aeccVar.y();
                            }
                            aecd aecdVar = (aecd) aeccVar.b;
                            aecd aecdVar2 = aecd.a;
                            aecdVar.b |= 32;
                            aecdVar.e = iIntValue;
                        }
                        aece aeceVar = pbhVar.e;
                        if (aeceVar != aece.DEFAULT) {
                            jyvVarI.l = aeceVar;
                        }
                        if (!((jyw) jyvVarI.a).d()) {
                            jyvVarI.k(pbhVar.f);
                        }
                        int[] iArr = pbhVar.g;
                        if (iArr != null) {
                            for (int i2 : iArr) {
                                jyvVarI.m(i2);
                            }
                        }
                        int i3 = parVar2.b - 1;
                        if (i3 == 0) {
                            jyvVarI.o(parVar2.a);
                        } else if (i3 == 1) {
                            jyvVarI.o(null);
                        } else if (i3 != 2) {
                            throw new IllegalArgumentException("Dropped logs must not be logged.");
                        }
                        if (Log.isLoggable("Logging.Clearcut", 3)) {
                            Log.d("Logging.Clearcut", jyvVarI.toString());
                        }
                        return otn.a(jyvVarI.d());
                    }
                }, pbpVar.b);
            }
        }, this.b), kej.class, new zvi() { // from class: pbn
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws kej {
                kej kejVar = (kej) obj;
                int i = kejVar.a.f;
                if (i != 17 && i != 31003) {
                    throw kejVar;
                }
                if (Log.isLoggable("Logging.Clearcut", 3)) {
                    Log.d("Logging.Clearcut", "Could not log data.", kejVar);
                }
                return zxy.a;
            }
        }, zwk.a);
    }

    public final synchronized jyw b(par parVar) {
        int i = parVar.b - 1;
        if (i == 0 || i == 1) {
            if (this.e == null) {
                Context context = this.a;
                List list = jyw.m;
                this.e = new jyt(context, "NOOP_LOG_SOURCE_NAME").b();
            }
            return this.e;
        }
        if (i != 2) {
            return null;
        }
        if (this.f == null) {
            this.f = jyw.g(this.a, "NOOP_LOG_SOURCE_NAME").b();
        }
        return this.f;
    }
}
