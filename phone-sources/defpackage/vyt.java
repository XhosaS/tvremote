package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyt implements uqs {
    public final ImmutableSet i;
    private final ImmutableList m;
    private final ImmutableMap n;
    private static final rmp j = new rmp("google.internal.play.movies.dfe.v1beta.discovery.DiscoveryService");
    public static final rmp a = new rmp("google.internal.play.movies.dfe.v1beta.discovery.DiscoveryService.");
    private static final rmp k = new rmp("google.internal.play.movies.dfe.v1beta.discovery.DiscoveryService/");
    public static final uqr b = new vgj(3, (short[]) null);
    public static final uqr c = new vgj(4, (int[]) null);
    public static final uqr d = new vgj(5, (boolean[]) null);
    public static final uqr e = new vgj(6, (float[]) null);
    public static final uqr f = new vgj(7, (byte[][]) null);
    public static final uqr g = new vgj(8, (char[][]) null);
    public static final vyt h = new vyt();
    private static final rmp l = new rmp("playmoviesdfe-pa.googleapis.com");

    private vyt() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        this.m = builder.build();
        ImmutableSet.Builder builder2 = ImmutableSet.builder();
        builder2.add((ImmutableSet.Builder) "https://www.googleapis.com/auth/android_video");
        builder2.add((ImmutableSet.Builder) "https://www.googleapis.com/auth/android_video");
        this.i = builder2.build();
        uqr uqrVar = b;
        uqr uqrVar2 = c;
        uqr uqrVar3 = d;
        uqr uqrVar4 = e;
        uqr uqrVar5 = f;
        uqr uqrVar6 = g;
        ImmutableSet.of(uqrVar, uqrVar2, uqrVar3, uqrVar4, uqrVar5, uqrVar6, new uqr[0]);
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.put("GetFeed", uqrVar);
        builder3.put("Search", uqrVar2);
        builder3.put("GetRelated", uqrVar3);
        builder3.put("Suggest", uqrVar4);
        builder3.put("FetchByToken", uqrVar5);
        builder3.put("GetPlaylist", uqrVar6);
        this.n = builder3.build();
        ImmutableMap.builder().build();
    }

    @Override // defpackage.uqs
    public final rmp a() {
        return j;
    }

    @Override // defpackage.uqs
    public final rmp b() {
        return l;
    }

    @Override // defpackage.uqs
    public final uqr c(String str) {
        String str2 = k.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ImmutableMap immutableMap = this.n;
        if (immutableMap.containsKey(strSubstring)) {
            return (uqr) immutableMap.get(strSubstring);
        }
        return null;
    }

    @Override // defpackage.uqs
    public final List d() {
        return this.m;
    }
}
