package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dka {
    public final Object a;
    public final Object b;

    public dka(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public static String d() {
        if (Build.VERSION.SDK_INT < 26) {
            return Build.SERIAL;
        }
        try {
            return Build.getSerial();
        } catch (SecurityException unused) {
            return "unknown";
        }
    }

    public static String e(String str) {
        String strConcat = "atvremote.".concat(str);
        try {
            return SystemProperties.get(strConcat, (String) null);
        } catch (IllegalArgumentException e) {
            if (strConcat.length() > 31) {
                return SystemProperties.get(strConcat.substring(0, 31), (String) null);
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[PHI: r2
  0x001c: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:6:0x000d, B:10:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.blt g(defpackage.bmf r4) {
        /*
            int r0 = r4.c
            int r0 = defpackage.ii.ab(r0)
            r1 = 1
            if (r0 != 0) goto La
            r0 = r1
        La:
            int r0 = r0 + (-1)
            r2 = 2
            if (r0 == r1) goto L1c
            r3 = 3
            if (r0 == r2) goto L1a
            r2 = 4
            if (r0 == r3) goto L1c
            if (r0 == r2) goto L18
            goto L1d
        L18:
            r1 = 5
            goto L1d
        L1a:
            r1 = r3
            goto L1d
        L1c:
            r1 = r2
        L1d:
            blt r0 = new blt
            int r4 = r4.d
            r0.<init>(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dka.g(bmf):blt");
    }

    private static bmf j(blt bltVar) {
        clo cloVarO = bmf.a.o();
        int i = bltVar.b - 1;
        if (i == 1) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bmf bmfVar = (bmf) cloVarO.b;
            bmfVar.c = 1;
            bmfVar.b = 1 | bmfVar.b;
        } else if (i == 2) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bmf bmfVar2 = (bmf) cloVarO.b;
            bmfVar2.c = 2;
            bmfVar2.b = 1 | bmfVar2.b;
        } else if (i == 3) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bmf bmfVar3 = (bmf) cloVarO.b;
            bmfVar3.c = 3;
            bmfVar3.b = 1 | bmfVar3.b;
        } else if (i != 4) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bmf bmfVar4 = (bmf) cloVarO.b;
            bmfVar4.c = 0;
            bmfVar4.b = 1 | bmfVar4.b;
        } else {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bmf bmfVar5 = (bmf) cloVarO.b;
            bmfVar5.c = 4;
            bmfVar5.b = 1 | bmfVar5.b;
        }
        int i2 = bltVar.a;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bmf bmfVar6 = (bmf) cloVarO.b;
        bmfVar6.b = 2 | bmfVar6.b;
        bmfVar6.d = i2;
        return (bmf) cloVarO.i();
    }

    private final void k(bmh bmhVar) {
        bmhVar.aI((OutputStream) this.a);
    }

    private static clo l(int i) {
        clo cloVarO = bmh.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        bmh bmhVar = (bmh) cltVar;
        bmhVar.b |= 1;
        bmhVar.e = 2;
        if (!cltVar.A()) {
            cloVarO.l();
        }
        bmh bmhVar2 = (bmh) cloVarO.b;
        bmhVar2.f = i;
        bmhVar2.b |= 2;
        return cloVarO;
    }

    public final boolean a(String str) {
        return str.startsWith((String) this.b);
    }

    public final boolean b(String str) {
        return str.startsWith((String) this.a);
    }

    public final String c() {
        return Settings.Global.getString(((Context) this.b).getContentResolver(), "device_name");
    }

    public final boolean f(String str, boolean z) throws anp {
        Object obj;
        Boolean bool;
        String strE = e(str);
        boolean z2 = false;
        if (!TextUtils.isEmpty(strE)) {
            return strE.equalsIgnoreCase("true") || strE.equals("1");
        }
        try {
            ContentResolver contentResolver = ((btn) this.a).b;
            String strG = b.g(str, "atvremoteservice:");
            anq anqVar = anl.a;
            anq.c(contentResolver);
            synchronized (anqVar) {
                anqVar.a(contentResolver);
                obj = anqVar.e;
                bool = (Boolean) anq.e(anqVar.b, strG, Boolean.valueOf(z));
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            String strD = anqVar.d(contentResolver, strG);
            if (strD == null || strD.isEmpty()) {
                z2 = z;
            } else if (anm.c.matcher(strD).matches()) {
                bool = true;
                z2 = true;
            } else if (anm.d.matcher(strD).matches()) {
                bool = false;
            } else {
                Log.w("Gservices", "attempt to read Gservices key " + strG + " (value \"" + strD + "\") as boolean");
                z2 = z;
            }
            synchronized (anqVar) {
                anqVar.b(obj, anqVar.b, strG, bool);
            }
            return z2;
        } catch (SecurityException e) {
            ((cbs) ((cbs) btn.a.g().i(e)).j("com/google/android/tv/remote/service/gservices/EnabledGServicesHelper", "getBoolean", 43, "EnabledGServicesHelper.java")).p("Gservices failed to get value");
            return z;
        }
    }

    public final void h(Exception exc) {
        k((bmh) (exc instanceof blk ? l(401) : exc instanceof blj ? l(402) : l(400)).i());
    }

    public final void i(blx blxVar) {
        int i = blxVar.d - 1;
        clo cloVarL = l(200);
        int i2 = 1;
        switch (i) {
            case 1:
                blw blwVar = (blw) blxVar;
                clo cloVarO = bmi.a.o();
                String str = blwVar.a;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bmi bmiVar = (bmi) cloVarO.b;
                str.getClass();
                bmiVar.b = 1 | bmiVar.b;
                bmiVar.c = str;
                if (blwVar.a()) {
                    String str2 = blwVar.b;
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bmi bmiVar2 = (bmi) cloVarO.b;
                    str2.getClass();
                    bmiVar2.b = 2 | bmiVar2.b;
                    bmiVar2.d = str2;
                }
                bmi bmiVar3 = (bmi) cloVarO.i();
                if (!cloVarL.b.A()) {
                    cloVarL.l();
                }
                bmh bmhVar = (bmh) cloVarL.b;
                bmh bmhVar2 = bmh.a;
                bmiVar3.getClass();
                bmhVar.d = bmiVar3;
                bmhVar.c = 10;
                break;
            case 2:
                clo cloVarO2 = bmj.a.o();
                String str3 = ((blv) blxVar).a;
                if (str3 != null) {
                    if (!cloVarO2.b.A()) {
                        cloVarO2.l();
                    }
                    bmj bmjVar = (bmj) cloVarO2.b;
                    bmjVar.b = 1 | bmjVar.b;
                    bmjVar.c = str3;
                }
                bmj bmjVar2 = (bmj) cloVarO2.i();
                if (!cloVarL.b.A()) {
                    cloVarL.l();
                }
                bmh bmhVar3 = (bmh) cloVarL.b;
                bmh bmhVar4 = bmh.a;
                bmjVar2.getClass();
                bmhVar3.d = bmjVar2;
                bmhVar3.c = 11;
                break;
            case 3:
                blu bluVar = (blu) blxVar;
                clo cloVarO3 = bmg.a.o();
                int i3 = bluVar.c;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 == 1) {
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    bmg bmgVar = (bmg) cloVarO3.b;
                    bmgVar.e = 2;
                    bmgVar.b |= 1;
                } else if (i4 == 2) {
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    bmg bmgVar2 = (bmg) cloVarO3.b;
                    bmgVar2.e = 1;
                    bmgVar2.b = 1 | bmgVar2.b;
                }
                Iterator it = new LinkedHashSet(bluVar.b).iterator();
                while (it.hasNext()) {
                    bmf bmfVarJ = j((blt) it.next());
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    bmg bmgVar3 = (bmg) cloVarO3.b;
                    bmfVarJ.getClass();
                    cme cmeVar = bmgVar3.d;
                    if (!cmeVar.c()) {
                        bmgVar3.d = clt.t(cmeVar);
                    }
                    bmgVar3.d.add(bmfVarJ);
                }
                Iterator it2 = new LinkedHashSet(bluVar.a).iterator();
                while (it2.hasNext()) {
                    bmf bmfVarJ2 = j((blt) it2.next());
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    bmg bmgVar4 = (bmg) cloVarO3.b;
                    bmfVarJ2.getClass();
                    cme cmeVar2 = bmgVar4.c;
                    if (!cmeVar2.c()) {
                        bmgVar4.c = clt.t(cmeVar2);
                    }
                    bmgVar4.c.add(bmfVarJ2);
                }
                bmg bmgVar5 = (bmg) cloVarO3.i();
                if (!cloVarL.b.A()) {
                    cloVarL.l();
                }
                bmh bmhVar5 = (bmh) cloVarL.b;
                bmh bmhVar6 = bmh.a;
                bmgVar5.getClass();
                bmhVar5.d = bmgVar5;
                bmhVar5.c = 20;
                break;
            case 4:
                bls blsVar = (bls) blxVar;
                clo cloVarO4 = bmd.a.o();
                bmf bmfVarJ3 = j(blsVar.a);
                if (!cloVarO4.b.A()) {
                    cloVarO4.l();
                }
                clt cltVar = cloVarO4.b;
                bmd bmdVar = (bmd) cltVar;
                bmfVarJ3.getClass();
                bmdVar.c = bmfVarJ3;
                bmdVar.b |= 1;
                int i5 = blsVar.b - 1;
                if (i5 == 1) {
                    i2 = 2;
                } else if (i5 == 2) {
                    i2 = 3;
                }
                if (!cltVar.A()) {
                    cloVarO4.l();
                }
                bmd bmdVar2 = (bmd) cloVarO4.b;
                bmdVar2.d = i2 - 1;
                bmdVar2.b = 2 | bmdVar2.b;
                bmd bmdVar3 = (bmd) cloVarO4.i();
                if (!cloVarL.b.A()) {
                    cloVarL.l();
                }
                bmh bmhVar7 = (bmh) cloVarL.b;
                bmh bmhVar8 = bmh.a;
                bmdVar3.getClass();
                bmhVar7.d = bmdVar3;
                bmhVar7.c = 30;
                break;
            case 5:
                bme bmeVar = bme.a;
                if (!cloVarL.b.A()) {
                    cloVarL.l();
                }
                bmh bmhVar9 = (bmh) cloVarL.b;
                bmh bmhVar10 = bmh.a;
                bmeVar.getClass();
                bmhVar9.d = bmeVar;
                bmhVar9.c = 31;
                break;
            case 6:
                clo cloVarO5 = bmk.a.o();
                ckv ckvVarP = ckv.p(((blz) blxVar).a);
                if (!cloVarO5.b.A()) {
                    cloVarO5.l();
                }
                bmk bmkVar = (bmk) cloVarO5.b;
                bmkVar.b = 1 | bmkVar.b;
                bmkVar.c = ckvVarP;
                bmk bmkVar2 = (bmk) cloVarO5.i();
                if (!cloVarL.b.A()) {
                    cloVarL.l();
                }
                bmh bmhVar11 = (bmh) cloVarL.b;
                bmh bmhVar12 = bmh.a;
                bmkVar2.getClass();
                bmhVar11.d = bmkVar2;
                bmhVar11.c = 40;
                break;
            default:
                clo cloVarO6 = bml.a.o();
                ckv ckvVarP2 = ckv.p(((bly) blxVar).a);
                if (!cloVarO6.b.A()) {
                    cloVarO6.l();
                }
                bml bmlVar = (bml) cloVarO6.b;
                bmlVar.b = 1 | bmlVar.b;
                bmlVar.c = ckvVarP2;
                bml bmlVar2 = (bml) cloVarO6.i();
                if (!cloVarL.b.A()) {
                    cloVarL.l();
                }
                bmh bmhVar13 = (bmh) cloVarL.b;
                bmh bmhVar14 = bmh.a;
                bmlVar2.getClass();
                bmhVar13.d = bmlVar2;
                bmhVar13.c = 41;
                break;
        }
        k((bmh) cloVarL.i());
    }

    public dka(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public dka() {
        this.a = new Hashtable();
        this.b = new Vector();
    }

    public dka(String str) {
        this.a = b.c(str, "-----BEGIN ", "-----");
        this.b = b.c(str, "-----END ", "-----");
    }
}
