package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rzo implements ttm {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ rzo(Object obj, Object obj2, String str, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = str;
    }

    @Override // defpackage.ttm
    public final Object get() throws Resources.NotFoundException, IOException {
        uio uioVar;
        if (this.d != 0) {
            int i = tzc.a;
            int i2 = tzh.a;
            tzg tzgVar = new tzg();
            tzgVar.e(((String) this.c).getBytes());
            tzgVar.a.put((byte) 0);
            tzgVar.g();
            tzgVar.e(this.a.getBytes());
            return ((tzs) ((aafi) this.b).c).i(tzgVar.m().d());
        }
        String str = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        try {
            Object obj3 = ((nuh) obj).c;
            uio uioVar2 = uip.a;
            obj3.getClass();
            str.getClass();
            Intent intent = new Intent("com.google.android.build.data.Properties");
            intent.setPackage(str);
            List<ResolveInfo> listQueryIntentServices = ((PackageManager) obj3).queryIntentServices(intent, 787072);
            if (listQueryIntentServices.isEmpty()) {
                uioVar = uip.a;
            } else {
                if (listQueryIntentServices.size() > 1) {
                    throw new IOException("Failed to resolve target AndroidBuildData");
                }
                int i3 = listQueryIntentServices.get(0).serviceInfo.metaData.getInt("com.google.android.build.data.properties");
                if (i3 == 0) {
                    uioVar = uip.a;
                } else {
                    try {
                        InputStream inputStreamOpenRawResource = ((rzr) obj2).a().openRawResource(i3);
                        vtp vtpVar = vtp.a;
                        vvs vvsVar = vvs.a;
                        vtp vtpVar2 = vtp.a;
                        uio uioVar3 = uio.a;
                        vte vteVarL = vte.L(inputStreamOpenRawResource);
                        vuc vucVarO = uioVar3.o();
                        try {
                            vvy vvyVarB = vvs.a.b(vucVarO);
                            vvyVarB.l(vucVarO, vtf.p(vteVarL), vtpVar2);
                            vvyVarB.g(vucVarO);
                            vuc.B(vucVarO);
                            uioVar = (uio) vucVarO;
                        } catch (vuq e) {
                            if (e.a) {
                                throw new vuq(e);
                            }
                            throw e;
                        } catch (IOException e2) {
                            if (e2.getCause() instanceof vuq) {
                                throw ((vuq) e2.getCause());
                            }
                            throw new vuq(e2);
                        } catch (vwf e3) {
                            throw e3.a();
                        } catch (RuntimeException e4) {
                            if (e4.getCause() instanceof vuq) {
                                throw ((vuq) e4.getCause());
                            }
                            throw e4;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        uioVar = uip.a;
                    }
                }
            }
            return Long.valueOf(uioVar.b);
        } catch (IOException e5) {
            Log.e("PhenotypeResourceReader", "Failed to read baseline CL for package ".concat(String.valueOf(str)), e5);
            return -1L;
        }
    }
}
