package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vev implements uqs {
    public final ImmutableSet k;
    private final ImmutableList o;
    private final ImmutableMap p;
    private static final rmp l = new rmp("google.internal.play.movies.dfe.v1beta.drm.DrmService");
    public static final rmp a = new rmp("google.internal.play.movies.dfe.v1beta.drm.DrmService.");
    private static final rmp m = new rmp("google.internal.play.movies.dfe.v1beta.drm.DrmService/");
    public static final uqr b = new veo(10, (int[][]) null);
    public static final uqr c = new veo(11, (boolean[][]) null);
    public static final uqr d = new veo(12, (float[][]) null);
    public static final uqr e = new veo(13, (byte[][][]) null);
    public static final uqr f = new veo(14, (char[][][]) null);
    public static final uqr g = new veo(15, (short[][][]) null);
    public static final uqr h = new veo(16, (int[][][]) null);
    public static final uqr i = new veo(17, (boolean[][][]) null);
    public static final vev j = new vev();
    private static final rmp n = new rmp("playmoviesdfe-pa.googleapis.com");

    private vev() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        this.o = builder.build();
        ImmutableSet.Builder builder2 = ImmutableSet.builder();
        builder2.add((ImmutableSet.Builder) "https://www.googleapis.com/auth/android_video");
        this.k = builder2.build();
        uqr uqrVar = b;
        uqr uqrVar2 = c;
        uqr uqrVar3 = d;
        uqr uqrVar4 = e;
        uqr uqrVar5 = f;
        uqr uqrVar6 = g;
        uqr uqrVar7 = h;
        uqr uqrVar8 = i;
        ImmutableSet.of(uqrVar, uqrVar2, uqrVar3, uqrVar4, uqrVar5, uqrVar6, uqrVar7, uqrVar8);
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.put("FetchCencLicense", uqrVar);
        builder3.put("FetchQcLicense", uqrVar2);
        builder3.put("FetchYoutubePolicy", uqrVar3);
        builder3.put("FetchFairplayLicense", uqrVar4);
        builder3.put("FetchFreeplayLicense", uqrVar5);
        builder3.put("FetchPlayreadyLicense", uqrVar6);
        builder3.put("FetchThirdPartyLicense", uqrVar7);
        builder3.put("GetCommonEncryptionKey", uqrVar8);
        this.p = builder3.build();
        ImmutableMap.builder().build();
    }

    @Override // defpackage.uqs
    public final rmp a() {
        return l;
    }

    @Override // defpackage.uqs
    public final rmp b() {
        return n;
    }

    @Override // defpackage.uqs
    public final uqr c(String str) {
        String str2 = m.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ImmutableMap immutableMap = this.p;
        if (immutableMap.containsKey(strSubstring)) {
            return (uqr) immutableMap.get(strSubstring);
        }
        return null;
    }

    @Override // defpackage.uqs
    public final List d() {
        return this.o;
    }
}
