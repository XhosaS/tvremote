package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dzc implements tsl {
    private final /* synthetic */ int a;

    public /* synthetic */ dzc(int i) {
        this.a = i;
    }

    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String string = bundle.getString(dzj.a);
                String string2 = bundle.getString(dzj.b);
                string2.getClass();
                return new dzj(string, string2);
            case 1:
                dzj dzjVar = (dzj) obj;
                Bundle bundle2 = new Bundle();
                String str = dzjVar.c;
                if (str != null) {
                    bundle2.putString(dzj.a, str);
                }
                bundle2.putString(dzj.b, dzjVar.d);
                return bundle2;
            case 2:
                dzj dzjVar2 = (dzj) obj;
                dze dzeVar = dze.a;
                return dzjVar2.c + ": " + dzjVar2.d;
            case 3:
                eas easVar = (eas) obj;
                Bundle bundle3 = new Bundle();
                int i = easVar.d;
                if (i != 0) {
                    bundle3.putInt(eas.a, i);
                }
                int i2 = easVar.e;
                if (i2 != 0) {
                    bundle3.putInt(eas.b, i2);
                }
                int i3 = easVar.f;
                if (i3 != 0) {
                    bundle3.putInt(eas.c, i3);
                }
                return bundle3;
            case 4:
                dzx dzxVar = (dzx) obj;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable(dzx.a, dzxVar.h);
                String str2 = dzxVar.i;
                if (str2 != null) {
                    bundle4.putString(dzx.b, str2);
                }
                String str3 = dzxVar.j;
                if (str3 != null) {
                    bundle4.putString(dzx.c, str3);
                }
                int i4 = dzxVar.k;
                if (i4 != 0) {
                    bundle4.putInt(dzx.d, i4);
                }
                int i5 = dzxVar.l;
                if (i5 != 0) {
                    bundle4.putInt(dzx.e, i5);
                }
                String str4 = dzxVar.m;
                if (str4 != null) {
                    bundle4.putString(dzx.f, str4);
                }
                String str5 = dzxVar.n;
                if (str5 != null) {
                    bundle4.putString(dzx.g, str5);
                }
                return bundle4;
            case 5:
                Bundle bundle5 = (Bundle) obj;
                return new eas(bundle5.getInt(eas.a, 0), bundle5.getInt(eas.b, 0), bundle5.getInt(eas.c, 0));
            case 6:
                Bundle bundle6 = (Bundle) obj;
                Uri uri = (Uri) bundle6.getParcelable(dzx.a);
                uri.getClass();
                String string3 = bundle6.getString(dzx.b);
                String string4 = bundle6.getString(dzx.c);
                int i6 = bundle6.getInt(dzx.d, 0);
                int i7 = bundle6.getInt(dzx.e, 0);
                String string5 = bundle6.getString(dzx.f);
                String string6 = bundle6.getString(dzx.g);
                dzw dzwVar = new dzw(uri);
                dzwVar.b = eae.i(string3);
                dzwVar.c = string4;
                dzwVar.d = i6;
                dzwVar.e = i7;
                dzwVar.f = string5;
                dzwVar.g = string6;
                return new dzx(dzwVar);
            case 7:
                ebb ebbVar = (ebb) obj;
                Bundle bundle7 = new Bundle();
                bundle7.putBundle(ebb.a, ebbVar.c.b());
                bundle7.putIntArray(ebb.b, sfy.ae(ebbVar.d));
                return bundle7;
            case 8:
                Bundle bundle8 = (Bundle) obj;
                Bundle bundle9 = bundle8.getBundle(ebb.a);
                bundle9.getClass();
                ArrayList parcelableArrayList = bundle9.getParcelableArrayList(eba.a);
                eba ebaVar = new eba(bundle9.getString(eba.b, ""), (dze[]) (parcelableArrayList == null ? ImmutableList.of() : ecm.a(new tsl() { // from class: eaz
                    @Override // defpackage.tsl
                    public final Object apply(Object obj2) {
                        Bundle bundle10 = (Bundle) obj2;
                        dze dzeVar2 = dze.a;
                        dzd dzdVar = new dzd();
                        if (bundle10 != null) {
                            ClassLoader classLoader = ecm.class.getClassLoader();
                            String str6 = edt.a;
                            bundle10.setClassLoader(classLoader);
                        }
                        String string7 = bundle10.getString(dze.b);
                        dze dzeVar3 = dze.a;
                        dzdVar.a = (String) dze.d(string7, dzeVar3.K);
                        dzdVar.b = (String) dze.d(bundle10.getString(dze.c), dzeVar3.L);
                        ArrayList parcelableArrayList2 = bundle10.getParcelableArrayList(dze.F);
                        int i8 = 0;
                        dzdVar.c(parcelableArrayList2 == null ? ImmutableList.of() : ecm.a(new dzc(i8), parcelableArrayList2));
                        dzdVar.d = (String) dze.d(bundle10.getString(dze.d), dzeVar3.N);
                        dzdVar.e = bundle10.getInt(dze.e, dzeVar3.O);
                        dzdVar.f = bundle10.getInt(dze.f, dzeVar3.P);
                        dzdVar.g = bundle10.getInt(dze.G, dzeVar3.Q);
                        dzdVar.h = bundle10.getInt(dze.g, dzeVar3.R);
                        dzdVar.i = bundle10.getInt(dze.h, dzeVar3.S);
                        dzdVar.j = (String) dze.d(bundle10.getString(dze.i), dzeVar3.U);
                        dzdVar.a((String) dze.d(bundle10.getString(dze.j), dzeVar3.X));
                        dzdVar.d((String) dze.d(bundle10.getString(dze.k), dzeVar3.Y));
                        dzdVar.n = bundle10.getInt(dze.l, dzeVar3.Z);
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            byte[] byteArray = bundle10.getByteArray(dze.e(i8));
                            if (byteArray == null) {
                                break;
                            }
                            arrayList.add(byteArray);
                            i8++;
                        }
                        dzdVar.p = arrayList;
                        dzdVar.q = (dza) bundle10.getParcelable(dze.m);
                        dzdVar.r = bundle10.getLong(dze.n, dzeVar3.ad);
                        dzdVar.t = bundle10.getInt(dze.o, dzeVar3.af);
                        dzdVar.u = bundle10.getInt(dze.p, dzeVar3.ag);
                        dzdVar.v = bundle10.getInt(dze.I, dzeVar3.ah);
                        dzdVar.w = bundle10.getInt(dze.J, dzeVar3.ai);
                        dzdVar.x = bundle10.getFloat(dze.q, dzeVar3.aj);
                        dzdVar.y = bundle10.getInt(dze.r, dzeVar3.ak);
                        dzdVar.z = bundle10.getFloat(dze.s, dzeVar3.al);
                        dzdVar.A = bundle10.getByteArray(dze.t);
                        dzdVar.B = bundle10.getInt(dze.u, dzeVar3.an);
                        dzdVar.D = bundle10.getInt(dze.H, dzeVar3.ap);
                        Bundle bundle11 = bundle10.getBundle(dze.v);
                        if (bundle11 != null) {
                            dzdVar.C = new dyt(bundle11.getInt(dyt.b, -1), bundle11.getInt(dyt.c, -1), bundle11.getInt(dyt.d, -1), bundle11.getByteArray(dyt.e), bundle11.getInt(dyt.f, -1), bundle11.getInt(dyt.g, -1));
                        }
                        dzdVar.E = bundle10.getInt(dze.w, dzeVar3.aq);
                        dzdVar.F = bundle10.getInt(dze.x, dzeVar3.ar);
                        dzdVar.G = bundle10.getInt(dze.y, dzeVar3.as);
                        dzdVar.H = bundle10.getInt(dze.z, dzeVar3.at);
                        dzdVar.I = bundle10.getInt(dze.A, dzeVar3.au);
                        dzdVar.J = bundle10.getInt(dze.B, dzeVar3.av);
                        dzdVar.L = bundle10.getInt(dze.D, dzeVar3.ax);
                        dzdVar.M = bundle10.getInt(dze.E, dzeVar3.ay);
                        dzdVar.N = bundle10.getInt(dze.C, dzeVar3.az);
                        return new dze(dzdVar);
                    }
                }, parcelableArrayList)).toArray(new dze[0]));
                int[] intArray = bundle8.getIntArray(ebb.b);
                intArray.getClass();
                return new ebb(ebaVar, sfy.ad(intArray));
            case 9:
                ebg ebgVar = (ebg) obj;
                Bundle bundle10 = new Bundle();
                bundle10.putBundle(ebg.a, ebgVar.f.b());
                bundle10.putIntArray(ebg.b, ebgVar.h);
                bundle10.putBooleanArray(ebg.c, ebgVar.i);
                bundle10.putBoolean(ebg.d, ebgVar.g);
                return bundle10;
            case 10:
                ecb ecbVar = ecb.a;
                return Integer.valueOf(((eca) obj).L);
            case 11:
                eca ecaVar = (eca) obj;
                Bundle bundleA = ecaVar.a();
                Bitmap bitmap = ecaVar.x;
                if (bitmap != null) {
                    bundleA.putParcelable(eca.e, bitmap);
                }
                return bundleA;
            case 12:
                return new ele((ecn) obj);
            case 13:
                int i8 = emx.i;
                return ImmutableList.of(Integer.valueOf(((exs) obj).a));
            case 14:
                return ((eqt) obj).f().c();
            case 15:
                fdp fdpVar = (fdp) obj;
                fdpVar.f();
                return fdpVar.getClass().getSimpleName();
            case 16:
                return ((evx) obj).h().c();
            case 17:
                exi exiVar = exi.a;
                return Integer.valueOf(((eba) obj).e);
            case 18:
                return ((eba) obj).b();
            case 19:
                int i9 = eyb.a;
                return Long.valueOf(((fit) obj).b);
            default:
                int i10 = eyb.a;
                return Long.valueOf(((fit) obj).c);
        }
    }
}
