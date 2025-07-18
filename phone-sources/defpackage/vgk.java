package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgk implements uqs {
    public final ImmutableSet h;
    private final ImmutableList l;
    private final ImmutableMap m;
    private static final rmp i = new rmp("google.internal.play.movies.dfe.v1beta.manifest.ManifestService");
    public static final rmp a = new rmp("google.internal.play.movies.dfe.v1beta.manifest.ManifestService.");
    private static final rmp j = new rmp("google.internal.play.movies.dfe.v1beta.manifest.ManifestService/");
    public static final uqr b = new veo(18, (float[][][]) null);
    public static final uqr c = new veo(19, (byte[]) null, (byte[]) null);
    public static final uqr d = new veo(20, (char[]) null, (byte[]) null);
    public static final uqr e = new vgj(1, (byte[]) null);
    public static final uqr f = new vgj(0);
    public static final vgk g = new vgk();
    private static final rmp k = new rmp("playmoviesdfe-pa.googleapis.com");

    private vgk() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        this.l = builder.build();
        ImmutableSet.Builder builder2 = ImmutableSet.builder();
        builder2.add((ImmutableSet.Builder) "https://www.googleapis.com/auth/android_video");
        builder2.add((ImmutableSet.Builder) "https://www.googleapis.com/auth/android_video");
        this.h = builder2.build();
        uqr uqrVar = b;
        uqr uqrVar2 = c;
        uqr uqrVar3 = d;
        uqr uqrVar4 = e;
        uqr uqrVar5 = f;
        ImmutableSet.of(uqrVar, uqrVar2, uqrVar3, uqrVar4, uqrVar5);
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.put("GetStreamInfoInternal", uqrVar);
        builder3.put("GetStreamInfoForHls", uqrVar2);
        builder3.put("GetStreamInfoForDash", uqrVar3);
        builder3.put("GetStreamInfoUrl", uqrVar4);
        builder3.put("GetMpdForDashXml", uqrVar5);
        this.m = builder3.build();
        ImmutableMap.builder().build();
    }

    @Override // defpackage.uqs
    public final rmp a() {
        return i;
    }

    @Override // defpackage.uqs
    public final rmp b() {
        return k;
    }

    @Override // defpackage.uqs
    public final uqr c(String str) {
        String str2 = j.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ImmutableMap immutableMap = this.m;
        if (immutableMap.containsKey(strSubstring)) {
            return (uqr) immutableMap.get(strSubstring);
        }
        return null;
    }

    @Override // defpackage.uqs
    public final List d() {
        return this.l;
    }
}
