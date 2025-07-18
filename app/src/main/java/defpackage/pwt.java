package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pwt implements pxy {
    public final Context a;
    public final pkn b;
    private final ujk c;
    private final Executor d;
    private final phg e;

    public pwt(Context context, pkn pknVar, ujk ujkVar, Executor executor, phg phgVar) {
        this.a = context;
        this.b = pknVar;
        this.c = ujkVar;
        this.d = executor;
        this.e = phgVar;
    }

    @Override // defpackage.pxy
    public final zyd a() {
        return this.c.a(new yqi() { // from class: pwo
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pjk pjkVar = new pjk();
                pjkVar.B((pjm) obj);
                abxd abxdVar = pjkVar.a;
                if ((abxdVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
                    throw new IllegalArgumentException("Default instance must be immutable.");
                }
                pjkVar.b = (abxd) abxdVar.cM(4, null);
                return (pjm) pjkVar.v();
            }
        }, this.d);
    }

    public final zyd b(final ptm ptmVar, final int i) {
        zyd zydVarA;
        if (i > ptmVar.d) {
            return zxn.h(true);
        }
        ptm ptmVarA = ptm.a(i);
        int iOrdinal = ptmVarA.ordinal();
        if (iOrdinal == 1) {
            ujk ujkVar = this.c;
            yqi yqiVar = new yqi() { // from class: pwr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    pjm pjmVar = (pjm) obj;
                    int i2 = qce.a;
                    pjk pjkVar = new pjk();
                    pjkVar.B(pjmVar);
                    pwt pwtVar = this.a;
                    for (String str : DesugarCollections.unmodifiableMap(pjmVar.b).keySet()) {
                        try {
                            pjf pjfVarA = qeq.a(str, pwtVar.a, pwtVar.b);
                            str.getClass();
                            abyl abylVar = pjmVar.b;
                            pjj pjjVar = abylVar.containsKey(str) ? (pjj) abylVar.get(str) : null;
                            pjkVar.b(str);
                            if (pjjVar == null) {
                                qce.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                            } else {
                                pjkVar.a(qeq.d(pjfVarA), pjjVar);
                            }
                        } catch (qep unused) {
                            qce.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                            pwtVar.b.a();
                            pjkVar.b(str);
                        }
                    }
                    return (pjm) pjkVar.v();
                }
            };
            Executor executor = this.d;
            zydVarA = qfr.c(ujkVar.a(yqiVar, executor)).e(new yqi() { // from class: pws
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return true;
                }
            }, executor).a(IOException.class, new yqi() { // from class: pwa
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    qce.b("Failed to commit migration metadata to disk");
                    new Exception("Migration to DownloadTransform failed.", (IOException) obj);
                    this.a.b.a();
                    return false;
                }
            }, executor);
        } else if (iOrdinal != 2) {
            zydVarA = zxn.g(new UnsupportedOperationException("Upgrade to version " + ptmVarA.name() + "not supported!"));
        } else {
            ujk ujkVar2 = this.c;
            yqi yqiVar2 = new yqi() { // from class: pwl
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    pjm pjmVar = (pjm) obj;
                    int i2 = qce.a;
                    pjk pjkVar = new pjk();
                    pjkVar.B(pjmVar);
                    pwt pwtVar = this.a;
                    for (String str : DesugarCollections.unmodifiableMap(pjmVar.b).keySet()) {
                        try {
                            pjf pjfVarA = qeq.a(str, pwtVar.a, pwtVar.b);
                            str.getClass();
                            abyl abylVar = pjmVar.b;
                            pjj pjjVar = abylVar.containsKey(str) ? (pjj) abylVar.get(str) : null;
                            pjkVar.b(str);
                            if (pjjVar == null) {
                                qce.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                            } else {
                                pjkVar.a(qeq.c(pjfVarA), pjjVar);
                            }
                        } catch (qep unused) {
                            qce.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                            pwtVar.b.a();
                            pjkVar.b(str);
                        }
                    }
                    return (pjm) pjkVar.v();
                }
            };
            Executor executor2 = this.d;
            zydVarA = qfr.c(ujkVar2.a(yqiVar2, executor2)).e(new yqi() { // from class: pwm
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return true;
                }
            }, executor2).a(IOException.class, new yqi() { // from class: pwn
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    qce.b("Failed to commit migration metadata to disk");
                    new Exception("Migration to ChecksumOnly failed.", (IOException) obj);
                    this.a.b.a();
                    return false;
                }
            }, executor2);
        }
        return zuz.h(zydVarA, wyo.c(new zvi() { // from class: pwc
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return zxn.h(false);
                }
                ptm ptmVar2 = ptmVar;
                int i2 = i;
                pwt pwtVar = this.a;
                ptn.c(pwtVar.a, ptm.a(i2));
                return pwtVar.b(ptmVar2, i2 + 1);
            }
        }), this.d);
    }

    @Override // defpackage.pxy
    public final zyd c() {
        final AtomicReference atomicReference = new AtomicReference(new ArrayList());
        yqi yqiVar = new yqi() { // from class: pwp
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pjm pjmVar = (pjm) obj;
                ArrayList arrayList = new ArrayList();
                pjk pjkVar = new pjk();
                pjkVar.B(pjmVar);
                pwt pwtVar = this.a;
                for (String str : DesugarCollections.unmodifiableMap(pjmVar.b).keySet()) {
                    try {
                        arrayList.add(qeq.a(str, pwtVar.a, pwtVar.b));
                    } catch (qep e) {
                        pjkVar.b(str);
                        qce.f(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                        pkn pknVar = pwtVar.b;
                        yrl.c("|").g(str).size();
                        pknVar.a();
                    }
                }
                atomicReference.set(arrayList);
                return (pjm) pjkVar.v();
            }
        };
        ujk ujkVar = this.c;
        Executor executor = this.d;
        return zuz.g(ujkVar.a(yqiVar, executor), wyo.a(new yqi() { // from class: pwq
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return (List) atomicReference.get();
            }
        }), executor);
    }

    @Override // defpackage.pxy
    public final zyd d() {
        Context context = this.a;
        if (!ptn.b(context)) {
            int i = qce.a;
            ptn.d(context);
            ptn.c(context, ptm.a(this.e.h()));
            return zxn.h(false);
        }
        final ptm ptmVarA = ptm.a(this.e.h());
        pkn pknVar = this.b;
        ptm ptmVarA2 = ptn.a(context, pknVar);
        int i2 = ptmVarA.d;
        int i3 = ptmVarA2.d;
        if (i2 == i3) {
            return zxn.h(true);
        }
        if (i2 >= i3) {
            qfr qfrVarC = qfr.c(b(ptmVarA, i3 + 1));
            zvi zviVar = new zvi() { // from class: pvz
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    this.a.i(ptmVarA);
                    return zxn.g((Exception) obj);
                }
            };
            Executor executor = this.d;
            return qfrVarC.b(Exception.class, zviVar, executor).g(new zvi() { // from class: pwk
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    this.a.i(ptmVarA);
                    return zxn.h((Boolean) obj);
                }
            }, executor);
        }
        qce.e("%s Cannot migrate back from value %s to %s. Clear everything!", "ProtoDataStoreSharedFilesMetadata", ptmVarA2, ptmVarA);
        new Exception("Downgraded file key from " + String.valueOf(ptmVarA2) + " to " + String.valueOf(ptmVarA) + ".");
        pknVar.a();
        ptn.c(context, ptmVarA);
        return zxn.h(false);
    }

    @Override // defpackage.pxy
    public final zyd e(final pjf pjfVar) {
        zyd zydVarF = f(new zdd(pjfVar));
        yqi yqiVar = new yqi() { // from class: pwb
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return (pjj) ((yyr) obj).get(pjfVar);
            }
        };
        return zuz.g(zydVarF, wyo.a(yqiVar), zwk.a);
    }

    @Override // defpackage.pxy
    public final zyd f(final yzq yzqVar) {
        zyd zydVarC = this.c.c();
        yqi yqiVar = new yqi() { // from class: pwd
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pjm pjmVar = (pjm) obj;
                yyn yynVar = new yyn(4);
                zdl it = yzqVar.iterator();
                while (it.hasNext()) {
                    pwt pwtVar = this.a;
                    pjf pjfVar = (pjf) it.next();
                    pjj pjjVar = (pjj) DesugarCollections.unmodifiableMap(pjmVar.b).get(qeq.b(pjfVar, pwtVar.a, pwtVar.b));
                    if (pjjVar != null) {
                        yynVar.c(pjfVar, pjjVar);
                    }
                }
                return yynVar.a(false);
            }
        };
        return zuz.g(zydVarC, wyo.a(yqiVar), zwk.a);
    }

    @Override // defpackage.pxy
    public final zyd g(pjf pjfVar) {
        final String strB = qeq.b(pjfVar, this.a, this.b);
        yqi yqiVar = new yqi() { // from class: pwh
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pjk pjkVar = new pjk();
                pjkVar.B((pjm) obj);
                pjkVar.b(strB);
                return (pjm) pjkVar.v();
            }
        };
        Executor executor = this.d;
        return qfr.c(this.c.a(yqiVar, executor)).e(new yqi() { // from class: pwi
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).a(IOException.class, new yqi() { // from class: pwj
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }

    @Override // defpackage.pxy
    public final zyd h(pjf pjfVar, final pjj pjjVar) {
        final String strB = qeq.b(pjfVar, this.a, this.b);
        yqi yqiVar = new yqi() { // from class: pwe
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pjk pjkVar = new pjk();
                pjkVar.B((pjm) obj);
                pjkVar.a(strB, pjjVar);
                return (pjm) pjkVar.v();
            }
        };
        Executor executor = this.d;
        return qfr.c(this.c.a(yqiVar, executor)).e(new yqi() { // from class: pwf
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).a(IOException.class, new yqi() { // from class: pwg
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }

    public final void i(ptm ptmVar) {
        Context context = this.a;
        pkn pknVar = this.b;
        if (ptn.a(context, pknVar).d == ptmVar.d || ptn.c(context, ptmVar)) {
            return;
        }
        qce.b(a.o(ptmVar, "Failed to commit migration version to disk. Fail to set target version to ", "."));
        new Exception(a.o(ptmVar, "Fail to set target version ", "."));
        pknVar.a();
    }
}
