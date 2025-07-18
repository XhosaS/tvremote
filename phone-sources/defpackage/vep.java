package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vep implements uqs {
    public final ImmutableSet m;
    private final ImmutableList q;
    private final ImmutableMap r;
    private static final rmp n = new rmp("google.internal.play.movies.dfe.v1beta.commerce.CommerceService");
    public static final rmp a = new rmp("google.internal.play.movies.dfe.v1beta.commerce.CommerceService.");
    private static final rmp o = new rmp("google.internal.play.movies.dfe.v1beta.commerce.CommerceService/");
    public static final uqr b = new veo(0);
    public static final uqr c = new veo(2, (char[]) null);
    public static final uqr d = new veo(3, (short[]) null);
    public static final uqr e = new veo(4, (int[]) null);
    public static final uqr f = new veo(5, (boolean[]) null);
    public static final uqr g = new veo(6, (float[]) null);
    public static final uqr h = new veo(7, (byte[][]) null);
    public static final uqr i = new veo(8, (char[][]) null);
    public static final uqr j = new veo(9, (short[][]) null);
    public static final uqr k = new veo(1, (byte[]) null);
    public static final vep l = new vep();
    private static final rmp p = new rmp("playmoviesdfe-pa.googleapis.com");

    private vep() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        this.q = builder.build();
        ImmutableSet.Builder builder2 = ImmutableSet.builder();
        builder2.add((ImmutableSet.Builder) "https://www.googleapis.com/auth/android_video");
        this.m = builder2.build();
        uqr uqrVar = b;
        uqr uqrVar2 = c;
        uqr uqrVar3 = d;
        uqr uqrVar4 = e;
        uqr uqrVar5 = f;
        uqr uqrVar6 = g;
        uqr uqrVar7 = h;
        uqr uqrVar8 = i;
        uqr uqrVar9 = j;
        uqr uqrVar10 = k;
        ImmutableSet.of(uqrVar, uqrVar2, uqrVar3, uqrVar4, uqrVar5, uqrVar6, uqrVar7, uqrVar8, uqrVar9, uqrVar10);
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.put("FetchLibrary", uqrVar);
        builder3.put("AcquirePurchase", uqrVar2);
        builder3.put("Grant", uqrVar3);
        builder3.put("Share", uqrVar4);
        builder3.put("UnShare", uqrVar5);
        builder3.put("Cancel", uqrVar6);
        builder3.put("Redeem", uqrVar7);
        builder3.put("FindVouchers", uqrVar8);
        builder3.put("FetchByToken", uqrVar9);
        builder3.put("ModifyEntitlement", uqrVar10);
        this.r = builder3.build();
        ImmutableMap.builder().build();
    }

    @Override // defpackage.uqs
    public final rmp a() {
        return n;
    }

    @Override // defpackage.uqs
    public final rmp b() {
        return p;
    }

    @Override // defpackage.uqs
    public final uqr c(String str) {
        String str2 = o.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ImmutableMap immutableMap = this.r;
        if (immutableMap.containsKey(strSubstring)) {
            return (uqr) immutableMap.get(strSubstring);
        }
        return null;
    }

    @Override // defpackage.uqs
    public final List d() {
        return this.q;
    }
}
