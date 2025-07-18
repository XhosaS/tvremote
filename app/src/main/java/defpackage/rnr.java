package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnr {
    public final String a;
    public final yrp b = new rnm(new yrp() { // from class: rnn
        @Override // defpackage.yrp
        public final Object eV() {
            rnr rnrVar = this.a;
            return rnrVar.b(rnrVar.a);
        }
    });
    final yrp c;
    final yrp d;
    Resources e;
    final /* synthetic */ rns f;

    public rnr(final rns rnsVar, final String str, yrp yrpVar) {
        this.f = rnsVar;
        this.a = str;
        this.c = new rnm(new yrp() { // from class: rno
            @Override // defpackage.yrp
            public final Object eV() throws Resources.NotFoundException, IOException {
                aagl aaglVar;
                rns rnsVar2 = rnsVar;
                String str2 = str;
                try {
                    PackageManager packageManager = rnsVar2.a;
                    rnr rnrVar = this.a;
                    aagl aaglVar2 = aagm.a;
                    if (packageManager == null || str2 == null) {
                        throw null;
                    }
                    Intent intent = new Intent("com.google.android.build.data.Properties");
                    intent.setPackage(str2);
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 787072);
                    if (!listQueryIntentServices.isEmpty()) {
                        if (listQueryIntentServices.size() > 1) {
                            throw new IOException("Failed to resolve target AndroidBuildData");
                        }
                        int i = listQueryIntentServices.get(0).serviceInfo.metaData.getInt("com.google.android.build.data.properties");
                        if (i != 0) {
                            try {
                                InputStream inputStreamOpenRawResource = rnrVar.a().openRawResource(i);
                                ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
                                abza abzaVar = abza.a;
                                ExtensionRegistryLite extensionRegistryLite2 = ExtensionRegistryLite.a;
                                aagl aaglVar3 = aagl.a;
                                abvt abvtVarK = abvt.K(inputStreamOpenRawResource, 4096);
                                aaglVar = new aagl();
                                try {
                                    abzj abzjVarA = abza.a.a(aaglVar.getClass());
                                    abzjVarA.i(aaglVar, abvu.p(abvtVarK), extensionRegistryLite2);
                                    abzjVarA.g(aaglVar);
                                    Byte b = (byte) 1;
                                    b.getClass();
                                } catch (abxv e) {
                                    if (e.a) {
                                        throw new abxv(e);
                                    }
                                    throw e;
                                } catch (abzz e2) {
                                    throw e2.a();
                                } catch (IOException e3) {
                                    if (e3.getCause() instanceof abxv) {
                                        throw ((abxv) e3.getCause());
                                    }
                                    throw new abxv(e3);
                                } catch (RuntimeException e4) {
                                    if (e4.getCause() instanceof abxv) {
                                        throw ((abxv) e4.getCause());
                                    }
                                    throw e4;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                        return Long.valueOf(aaglVar.b);
                    }
                    aaglVar = aagm.a;
                    return Long.valueOf(aaglVar.b);
                } catch (IOException e5) {
                    Log.e("PhenotypeResourceReader", "Failed to read baseline CL for package ".concat(String.valueOf(str2)), e5);
                    return -1L;
                }
            }
        });
        this.d = yrpVar;
    }

    public final Resources a() throws PackageManager.NameNotFoundException {
        Resources resources = this.e;
        if (resources != null) {
            return resources;
        }
        rns rnsVar = this.f;
        Resources resourcesForApplication = rnsVar.a.getResourcesForApplication(this.a);
        this.e = resourcesForApplication;
        return resourcesForApplication;
    }

    public final yyr b(String str) {
        ServiceInfo serviceInfo;
        loop0: while (true) {
            serviceInfo = null;
            for (ResolveInfo resolveInfo : this.f.a.queryIntentServices(new Intent("com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService").setPackage(str), 787072)) {
                if (serviceInfo == null) {
                    if (resolveInfo.serviceInfo == null || resolveInfo.serviceInfo.metaData == null || !"com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService".equals(resolveInfo.serviceInfo.name)) {
                        break;
                    }
                    serviceInfo = resolveInfo.serviceInfo;
                }
            }
        }
        if (serviceInfo == null) {
            Log.i("PhenotypeResourceReader", "unable to find any Phenotype resource metadata for ".concat(String.valueOf(str)));
            return zcl.a;
        }
        we weVar = new we();
        we weVar2 = new we();
        Bundle bundle = serviceInfo.metaData;
        for (String str2 : bundle.keySet()) {
            boolean zStartsWith = str2.startsWith("com.google.android.gms.phenotype.registration.binarypb:");
            boolean zStartsWith2 = str2.startsWith("com.google.android.gms.phenotype.heterodyne_info.binarypb:");
            if (zStartsWith || zStartsWith2) {
                int i = bundle.getInt(str2, 0);
                if (i != 0) {
                    Iterator it = yrl.b(new ypz(':')).e(str2).iterator();
                    int iA = zar.a(it, 1);
                    if (!it.hasNext()) {
                        throw new IndexOutOfBoundsException(a.a(iA, "position (1) must be less than the number of elements that remained (", ")"));
                    }
                    String str3 = (String) it.next();
                    if (zStartsWith) {
                        weVar.put(str3, Integer.valueOf(i));
                    } else {
                        weVar2.put(str3, Integer.valueOf(i));
                    }
                } else {
                    continue;
                }
            }
        }
        yyn yynVarH = yyr.h(weVar.d);
        for (Map.Entry entry : weVar.entrySet()) {
            String str4 = (String) entry.getKey();
            yynVarH.c(str4, new rnq(this, str4, ((Integer) entry.getValue()).intValue(), ((Integer) weVar2.getOrDefault(str4, 0)).intValue()));
        }
        return yynVarH.a(false);
    }
}
