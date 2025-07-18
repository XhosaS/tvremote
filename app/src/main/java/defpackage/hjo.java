package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjo implements nzy {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/elements/UrlCommandHandler");
    private final agow b;
    private final fgt c;
    private final exl d;
    private final agow e;
    private final gfr f;
    private final agow g;
    private final PackageManager h;
    private final ffk i;

    public hjo(agow agowVar, fgt fgtVar, exl exlVar, agow agowVar2, gfr gfrVar, agow agowVar3, PackageManager packageManager, ffk ffkVar) {
        this.b = agowVar;
        this.c = fgtVar;
        this.d = exlVar;
        this.e = agowVar2;
        this.f = gfrVar;
        this.g = agowVar3;
        this.h = packageManager;
        this.i = ffkVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return adaj.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, nzx nzxVar) {
        final adaj adajVar = (adaj) obj;
        return agff.g(new aggv() { // from class: hjn
            @Override // defpackage.aggv
            public final void a() throws abxv, URISyntaxException {
                this.a.c(adajVar);
            }
        });
    }

    public final /* synthetic */ void c(adaj adajVar) throws abxv, URISyntaxException {
        Intent uri;
        abxd abxdVar;
        byte bByteValue;
        String str = adajVar.c;
        if (TextUtils.isEmpty(str)) {
            ((zdv) ((zdv) a.c()).q("com/google/android/apps/tvsearch/results/elements/UrlCommandHandler", "onCommand", 98, "UrlCommandHandler.java")).u("Empty URL supplied to command handler");
            return;
        }
        try {
            uri = Intent.parseUri(str, 1);
            abxdVar = null;
        } catch (URISyntaxException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/apps/tvsearch/results/elements/UrlCommandHandler", "onCommand", 204, "UrlCommandHandler.java")).x("Error parsing intent url: %s", str);
        }
        if (uri.hasExtra("com.google.opa.DISPLAY_QUERY")) {
            if (((Boolean) this.b.a()).booleanValue()) {
                ((gfn) this.e.a()).b(rpm.s()).b().c();
            }
            if (((Boolean) this.g.a()).booleanValue()) {
                agow agowVar = this.e;
                ((gfn) agowVar.a()).b(rpm.bu()).b().c();
                ((gfn) agowVar.a()).a(rpm.cO()).b().c();
            } else {
                gfr gfrVar = this.f;
                gfrVar.b(rpm.bu(), null, null);
                gfrVar.a(rpm.cO(), abqb.OK, null, null);
            }
            this.i.o(yqv.b(uri.getStringExtra("com.google.opa.DISPLAY_QUERY")), 2);
            return;
        }
        if (!uri.hasExtra("server_token")) {
            if (Uri.parse(str).getScheme().equals("intent")) {
                if (uri.getAction().equals("com.google.android.apps.tvsearch.action.VIEW_DISCLAIMER")) {
                    this.d.b(uri, exj.c, exk.a, 2, null);
                    return;
                } else {
                    this.d.b(uri, exj.b, exk.a, 2, null);
                    return;
                }
            }
            ComponentName componentNameResolveActivity = uri.resolveActivity(this.h);
            if (componentNameResolveActivity != null && !componentNameResolveActivity.getPackageName().equals("com.google.android.tv.frameworkpackagestubs") && !componentNameResolveActivity.getPackageName().equals("com.android.tv.frameworkpackagestubs")) {
                this.d.b(uri, exj.b, exk.a, 2, null);
                return;
            }
            few fewVar = this.c.a;
            if (fewVar == null) {
                ((zdv) ((zdv) a.c()).q("com/google/android/apps/tvsearch/results/elements/UrlCommandHandler", "onCommand", 210, "UrlCommandHandler.java")).u("Null fragment view manager supplied to command handler");
                return;
            } else {
                huo.aB(fewVar, str);
                return;
            }
        }
        String strB = yqv.b(uri.getStringExtra("server_token"));
        try {
            zkl zklVar = zkl.d;
            byte[] bArrJ = zkl.e.j(strB);
            ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            xgw xgwVar = xgw.a;
            abxd abxdVarH = abxd.h(xgw.a, bArrJ, 0, bArrJ.length, generatedRegistry);
            if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                if (bByteValue != 0) {
                    boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                    if (true == zL) {
                        abxdVar = abxdVarH;
                    }
                    abxdVarH.cM(2, abxdVar);
                    if (zL) {
                    }
                }
                throw new abzz().a();
            }
            this.i.p((xgw) abxdVarH, Optional.empty());
        } catch (Exception e2) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e2)).q("com/google/android/apps/tvsearch/results/elements/UrlCommandHandler", "onCommand", 155, "UrlCommandHandler.java")).x("Failed to parse ClientInput from encoded string: %s", strB);
        }
    }
}
