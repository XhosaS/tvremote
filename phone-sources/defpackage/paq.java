package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.videos.R;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class paq {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public paq(iea ieaVar, iea ieaVar2, Resources resources, pkg pkgVar) {
        this.a = ieaVar;
        this.b = ieaVar2;
        this.c = resources;
        this.d = pkgVar;
    }

    public static final void a(Map map) {
        map.put(Integer.valueOf(R.layout.actor_filmography_item), new tid(1, 1));
    }

    public static paq b(lws lwsVar, Resources resources, iea ieaVar, san sanVar, rzy rzyVar) {
        Object obj;
        Object obj2;
        rzy rzyVar2 = (rzy) ((sah) sanVar.i(rzyVar).a(wgi.ACTOR_SECTION)).e();
        rzy rzyVar3 = (rzy) ((sah) sanVar.g(rzyVar2).a(wgi.CLOSE_BUTTON)).e();
        byte[] bArr = null;
        xpw xpwVar = new xpw(null, null);
        xpwVar.a(ImmutableList.of());
        trk trkVar = trk.a;
        xpwVar.e = trkVar;
        xpwVar.d = trkVar;
        xpwVar.f = trkVar;
        xpwVar.g = trkVar;
        String str = lwsVar.c;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        xpwVar.c = str;
        xpwVar.a(FluentIterable.from(lwsVar.f).transform(new nbe(resources, 0)).toList());
        xpwVar.a = rzyVar3;
        tju tjuVar = lwsVar.e;
        if (tjuVar != null) {
            xpwVar.g = tst.i(tjuVar.g);
        }
        String str2 = lwsVar.i;
        if (!TextUtils.isEmpty(str2)) {
            xpwVar.f = tst.i(str2);
        }
        String str3 = lwsVar.g;
        if (!TextUtils.isEmpty(str3)) {
            String str4 = lwsVar.h;
            if (TextUtils.isEmpty(str4)) {
                aacb aacbVar = new aacb(Integer.parseInt(ksi.g(str3)), Integer.parseInt(str3.length() >= 7 ? str3.substring(5, 7) : "01"), Integer.parseInt(str3.length() >= 10 ? str3.substring(8) : "01"));
                aacb aacbVar2 = new aacb(System.currentTimeMillis(), aadl.P());
                aabk aabkVar = aacbVar.b;
                aacj aacjVar = aacj.a;
                xpwVar.e = tst.i(resources.getString(R.string.knowledge_age_prefix, Integer.toString(aacj.d(aabp.c(aabkVar).L().a(aacbVar2.a, aacbVar.a)).g)));
            } else {
                xpwVar.d = tst.i(resources.getString(R.string.knowledge_years, ksi.g(str3), ksi.g(str4)));
            }
        }
        Object obj3 = xpwVar.c;
        if (obj3 == null || (obj = xpwVar.b) == null || (obj2 = xpwVar.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (xpwVar.c == null) {
                sb.append(" name");
            }
            if (xpwVar.b == null) {
                sb.append(" roles");
            }
            if (xpwVar.a == null) {
                sb.append(" closeUiNode");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        tst tstVar = (tst) xpwVar.e;
        zuw zuwVar = new zuw(R.layout.actor_profile, new krn(new nbd((String) obj3, (ImmutableList) obj, tstVar, (tst) xpwVar.d, (tst) xpwVar.f, (tst) xpwVar.g, (rzy) obj2), new jys(), 18, bArr), null);
        krz krzVar = new krz(ImmutableList.of());
        krzVar.a = new ids[]{ieaVar};
        krzVar.d(new lxg((Object) lwsVar, (Object) ieaVar, (Object) resources, 6));
        return new paq(zuwVar, krzVar.a(), sanVar, rzyVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [iea, java.lang.Object] */
    public final void c(ntp ntpVar) {
        ntpVar.x((zuw) this.a);
        ntpVar.x((zuw) this.c);
        ntpVar.c(this.d, (ifc) this.b);
    }

    public paq(Map map, yfo yfoVar, uhs uhsVar, osk oskVar) {
        this.a = map;
        this.b = yfoVar;
        this.c = uhsVar;
        this.d = oskVar;
    }

    public paq(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.d = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.c = yfoVar4;
    }

    private paq(zuw zuwVar, iea ieaVar, san sanVar, rzy rzyVar) {
        this.a = zuwVar;
        this.d = ieaVar;
        jys jysVar = new jys();
        iff iffVar = new iff();
        iffVar.f(R.layout.actor_filmography_item);
        iffVar.c = new nax(jysVar, sanVar, rzyVar, 0);
        iffVar.e(new mzs(3), false);
        iffVar.d = new mmg(7);
        iffVar.e = ksd.b();
        this.b = iffVar.b();
        this.c = new zuw(R.layout.actor_filmography_header, icz.a, null);
    }

    public paq(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.d = yfoVar3;
        yfoVar4.getClass();
        this.c = yfoVar4;
    }

    public paq(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.d = yfoVar3;
        yfoVar4.getClass();
        this.c = yfoVar4;
    }
}
