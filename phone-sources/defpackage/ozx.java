package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.function.BiPredicate$CC;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozx implements ozh {
    private final oyi a;
    private final /* synthetic */ int b;
    private final Object c;

    public ozx(Context context, oyi oyiVar, int i, byte[] bArr) {
        this.b = i;
        this.c = context;
        this.a = oyiVar;
    }

    private final boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.c).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // defpackage.ozh
    public final ozg a() {
        int i = this.b;
        return i != 0 ? i != 1 ? ozg.NETWORK : ozg.BATTERY : ozg.INSTALLED_APPS;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? BiPredicate$CC.$default$and(this, biPredicate) : BiPredicate$CC.$default$and(this, biPredicate) : BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        int i = this.b;
        return i != 0 ? i != 1 ? BiPredicate$CC.$default$negate(this) : BiPredicate$CC.$default$negate(this) : BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? BiPredicate$CC.$default$or(this, biPredicate) : BiPredicate$CC.$default$or(this, biPredicate) : BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final /* synthetic */ boolean test(Object obj, Object obj2) throws PackageManager.NameNotFoundException, NumberFormatException {
        int i;
        PackageInfo packageInfo;
        tst tstVarI;
        int i2 = this.b;
        if (i2 == 0) {
            uzd uzdVar = (uzd) obj;
            ozj ozjVar = (ozj) obj2;
            if (uzdVar.f.isEmpty()) {
                return true;
            }
            for (uyg uygVar : uzdVar.f) {
                uvv uvvVar = uygVar.c;
                if (uvvVar == null) {
                    uvvVar = uvv.a;
                }
                String str = uvvVar.c == 4 ? (String) uvvVar.d : "";
                uvv uvvVar2 = uygVar.c;
                if (uvvVar2 == null) {
                    uvvVar2 = uvv.a;
                }
                if (uvvVar2.e.isEmpty()) {
                    i = 0;
                } else {
                    uvv uvvVar3 = uygVar.c;
                    if (uvvVar3 == null) {
                        uvvVar3 = uvv.a;
                    }
                    i = Integer.parseInt(uvvVar3.e);
                }
                try {
                    packageInfo = ((PackageManager) this.c).getPackageInfo(str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                } catch (Exception e) {
                    if (ozjVar != null) {
                        this.a.f(ozjVar.b, e, str);
                    }
                }
                int iBm = a.bm(uygVar.d);
                if (iBm == 0) {
                    iBm = 1;
                }
                int i3 = iBm - 1;
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (packageInfo == null) {
                            if (ozjVar != null) {
                                this.a.c(ozjVar.b, "App is not installed (null package info)", new Object[0]);
                            }
                        } else if (packageInfo.versionCode < i) {
                            if (ozjVar != null) {
                                this.a.c(ozjVar.b, "Want version: %s \nHave version: %s", Integer.valueOf(i), Integer.valueOf(packageInfo.versionCode));
                            }
                        }
                        return false;
                    }
                    if (ozjVar != null) {
                        oyi oyiVar = this.a;
                        int iBm2 = a.bm(uygVar.d);
                        oyiVar.d(ozjVar.b, "Invalid InstallStatus for %s: %s", str, (iBm2 == 0 || iBm2 == 1) ? "UNKNOWN" : iBm2 != 2 ? "INSTALLED" : "NOT_INSTALLED");
                    }
                } else if (packageInfo != null && packageInfo.versionCode >= i) {
                    if (ozjVar != null) {
                        this.a.c(ozjVar.b, "App is installed AND has version: %s but want less than version %s", Integer.valueOf(packageInfo.versionCode), Integer.valueOf(i));
                    }
                    return false;
                }
            }
            return true;
        }
        if (i2 == 1) {
            ozj ozjVar2 = (ozj) obj2;
            int i4 = ((uzd) obj).d;
            if (i4 < 0 || i4 > 100) {
                if (ozjVar2 != null) {
                    this.a.d(ozjVar2.b, "Min battery percentage is not between 0 and 100", new Object[0]);
                }
                return false;
            }
            if (i4 == 0) {
                return true;
            }
            Intent intentRegisterReceiver = ((Context) this.c).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver == null) {
                tstVarI = trk.a;
            } else {
                int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                tstVarI = (intExtra < 0 || intExtra2 < 0) ? trk.a : tst.i(Integer.valueOf((int) ((intExtra * 100.0d) / intExtra2)));
            }
            if (!tstVarI.g()) {
                if (ozjVar2 != null) {
                    this.a.c(ozjVar2.b, "Unable to retrieve current battery percentage", new Object[0]);
                }
                return false;
            }
            if (((Integer) tstVarI.c()).intValue() >= i4) {
                return true;
            }
            if (ozjVar2 != null) {
                this.a.c(ozjVar2.b, "Battery percentage below minimum.", new Object[0]);
            }
            return false;
        }
        uzd uzdVar2 = (uzd) obj;
        ozj ozjVar3 = (ozj) obj2;
        uym uymVar = uzdVar2.c;
        if (uymVar == null) {
            uymVar = uym.a;
        }
        uvz uvzVarB = uvz.b(uymVar.c);
        if (uvzVarB == null) {
            uvzVarB = uvz.CONNECTIVITY_UNKNOWN;
        }
        int iOrdinal = uvzVarB.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (!b() && ozjVar3 != null) {
                        this.a.c(ozjVar3.b, "Offline but want online", new Object[0]);
                    }
                    return b();
                }
                if (ozjVar3 != null) {
                    oyi oyiVar2 = this.a;
                    uym uymVar2 = uzdVar2.c;
                    if (uymVar2 == null) {
                        uymVar2 = uym.a;
                    }
                    uvz uvzVarB2 = uvz.b(uymVar2.c);
                    if (uvzVarB2 == null) {
                        uvzVarB2 = uvz.CONNECTIVITY_UNKNOWN;
                    }
                    oyiVar2.d(ozjVar3.b, "Invalid Connectivity value: %s", uvzVarB2);
                }
                return true;
            }
            if (b() && ozjVar3 != null) {
                this.a.c(ozjVar3.b, "Online but want offline", new Object[0]);
            }
            if (b()) {
                return false;
            }
        }
        return true;
    }

    public ozx(Context context, oyi oyiVar, int i) {
        this.b = i;
        this.c = context.getPackageManager();
        this.a = oyiVar;
    }

    public ozx(Context context, oyi oyiVar, int i, char[] cArr) {
        this.b = i;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
        this.a = oyiVar;
    }
}
