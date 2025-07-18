package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcr implements uqs {
    public final ImmutableSet f;
    private final ImmutableList j;
    private final ImmutableMap k;
    private static final rmp g = new rmp("google.internal.play.movies.dfe.v1beta.userdata.UserDataService");
    public static final rmp a = new rmp("google.internal.play.movies.dfe.v1beta.userdata.UserDataService.");
    private static final rmp h = new rmp("google.internal.play.movies.dfe.v1beta.userdata.UserDataService/");
    public static final uqr b = new vgj(13, (byte[][][]) null);
    public static final uqr c = new vgj(14, (char[][][]) null);
    public static final uqr d = new vgj(15, (short[][][]) null);
    public static final wcr e = new wcr();
    private static final rmp i = new rmp("playmoviesdfe-pa.googleapis.com");

    private wcr() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        this.j = builder.build();
        ImmutableSet.Builder builder2 = ImmutableSet.builder();
        builder2.add((ImmutableSet.Builder) "https://www.googleapis.com/auth/android_video");
        this.f = builder2.build();
        uqr uqrVar = b;
        uqr uqrVar2 = c;
        uqr uqrVar3 = d;
        ImmutableSet.of(uqrVar, uqrVar2, uqrVar3);
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.put("Fetch", uqrVar);
        builder3.put("Update", uqrVar2);
        builder3.put("FetchByToken", uqrVar3);
        this.k = builder3.build();
        ImmutableMap.builder().build();
    }

    @Override // defpackage.uqs
    public final rmp a() {
        return g;
    }

    @Override // defpackage.uqs
    public final rmp b() {
        return i;
    }

    @Override // defpackage.uqs
    public final uqr c(String str) {
        String str2 = h.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ImmutableMap immutableMap = this.k;
        if (immutableMap.containsKey(strSubstring)) {
            return (uqr) immutableMap.get(strSubstring);
        }
        return null;
    }

    @Override // defpackage.uqs
    public final List d() {
        return this.j;
    }
}
