package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rko {
    public zyd a = null;
    public final ConcurrentMap b = new ConcurrentHashMap();

    public final synchronized zyd a(rfr rfrVar) {
        if (this.a == null) {
            Context context = rfrVar.d;
            Runnable runnable = new Runnable() { // from class: rkn
                @Override // java.lang.Runnable
                public final void run() {
                    rko rkoVar = this.a;
                    Iterator it = rkoVar.b.values().iterator();
                    while (it.hasNext()) {
                        rkp[] rkpVarArr = (rkp[]) ((AtomicReference) it.next()).get();
                        if (rkpVarArr != null) {
                            for (rkp rkpVar : rkpVarArr) {
                                rko rkoVar2 = rkp.a;
                                if (rkpVar.f) {
                                    rkpVar.c();
                                }
                            }
                        }
                    }
                    synchronized (rkoVar) {
                        rkoVar.a = null;
                    }
                }
            };
            zyh zyhVarE = rfrVar.e();
            int i = mhv.a;
            this.a = mhv.c(context, Executors.callable(runnable, null), zyhVarE);
        }
        return this.a;
    }

    public final boolean b(String str, String str2) {
        rkp[] rkpVarArrC = c(str);
        if (rkpVarArrC != null && rkpVarArrC.length != 0) {
            if (str2.equals("")) {
                rkp rkpVar = rkpVarArrC[0];
                rko rkoVar = rkp.a;
                return rkpVar.d.equals("");
            }
            if (Arrays.binarySearch(rkpVarArrC, str2) >= 0) {
                return true;
            }
        }
        return false;
    }

    public final rkp[] c(String str) {
        AtomicReference atomicReference = (AtomicReference) this.b.get(str);
        if (atomicReference == null) {
            return null;
        }
        return (rkp[]) atomicReference.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rkp d(final rfr rfrVar, final String str, final String str2, final boolean z, final boolean z2, final Set set) {
        rkp rkpVar;
        rkp[] rkpVarArr;
        int length;
        rkp[] rkpVarArr2;
        if (!str2.equals("") && z) {
            throw new IllegalStateException(a.e(str, "DirectBoot aware package ", " can not access account-scoped flags"));
        }
        yrp yrpVarA = yru.a(new yrp() { // from class: rki
            @Override // defpackage.yrp
            public final Object eV() {
                return new rkp(rfrVar, str, str2, z, z2, set);
            }
        });
        AtomicReference atomicReference = (AtomicReference) ConcurrentMap.EL.computeIfAbsent(this.b, str, new Function() { // from class: rkj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new AtomicReference();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        loop0: while (true) {
            rkp[] rkpVarArr3 = (rkp[]) atomicReference.get();
            if (rkpVarArr3 == null || (length = rkpVarArr3.length) == 0) {
                rkpVar = (rkp) yrpVarA.eV();
                rkpVarArr = new rkp[]{rkpVar};
            } else {
                rkpVarArr = null;
                if (str2.equals("")) {
                    rkpVar = rkpVarArr3[0];
                    rko rkoVar = rkp.a;
                    if (!rkpVar.d.equals("")) {
                        rkp rkpVar2 = (rkp) yrpVarA.eV();
                        rkp[] rkpVarArr4 = new rkp[length + 1];
                        rkpVarArr4[0] = rkpVar2;
                        System.arraycopy(rkpVarArr3, 0, rkpVarArr4, 1, length);
                        rkpVarArr = rkpVarArr4;
                        rkpVar = rkpVar2;
                    }
                } else {
                    int iBinarySearch = Arrays.binarySearch(rkpVarArr3, str2);
                    if (iBinarySearch >= 0) {
                        rkpVar = rkpVarArr3[iBinarySearch];
                    } else {
                        int i = length + 1;
                        rkp rkpVar3 = (rkp) yrpVarA.eV();
                        int i2 = ~iBinarySearch;
                        int i3 = length - i2;
                        if (i3 == 0) {
                            rkpVarArr2 = (rkp[]) Arrays.copyOf(rkpVarArr3, i);
                        } else {
                            rkp[] rkpVarArr5 = new rkp[i];
                            System.arraycopy(rkpVarArr3, 0, rkpVarArr5, 0, i2);
                            System.arraycopy(rkpVarArr3, i2, rkpVarArr5, i2 + 1, i3);
                            rkpVarArr2 = rkpVarArr5;
                        }
                        rkpVarArr2[i2] = rkpVar3;
                        rkpVar = rkpVar3;
                        rkpVarArr = rkpVarArr2;
                    }
                }
            }
            if (rkpVarArr == null) {
                break;
            }
            while (!atomicReference.compareAndSet(rkpVarArr3, rkpVarArr)) {
                if (atomicReference.get() != rkpVarArr3) {
                    break;
                }
            }
            break loop0;
        }
        if (rkpVarArr != null) {
            Context context = rfrVar.d;
            rkk rkkVar = new rkk(this);
            rkl rklVar = new rkl(this);
            if (rmi.a == null) {
                synchronized (rmi.class) {
                    if (rmi.a == null) {
                        if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(new rmi(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                            } else {
                                context.registerReceiver(new rmi(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            }
                        }
                        rmi.a = rkkVar;
                        rmi.b = rklVar;
                    }
                }
            }
            if (z2 && !str2.equals("")) {
                rkm rkmVar = new rkm(this);
                if (rlo.a == null) {
                    synchronized (rlo.class) {
                        if (rlo.a == null) {
                            rlo.a = rkmVar;
                        }
                    }
                }
            }
        }
        rko rkoVar2 = rkp.a;
        boolean z3 = rkpVar.e;
        return rkpVar;
    }
}
