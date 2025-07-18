package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyd implements uqs {
    public final ImmutableSet d;
    private final ImmutableList h;
    private final ImmutableMap i;
    private static final rmp e = new rmp("google.internal.play.movies.dfe.v1beta.config.ConfigService");
    public static final rmp a = new rmp("google.internal.play.movies.dfe.v1beta.config.ConfigService.");
    private static final rmp f = new rmp("google.internal.play.movies.dfe.v1beta.config.ConfigService/");
    public static final uqr b = new vgj(2, (char[]) null);
    public static final vyd c = new vyd();
    private static final rmp g = new rmp("playmoviesdfe-pa.googleapis.com");

    private vyd() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        builder.add((ImmutableList.Builder) "playmoviesdfe-pa.googleapis.com");
        this.h = builder.build();
        ImmutableSet.Builder builder2 = ImmutableSet.builder();
        builder2.add((ImmutableSet.Builder) "https://www.googleapis.com/auth/android_video");
        this.d = builder2.build();
        uqr uqrVar = b;
        ImmutableSet.of(uqrVar);
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.put("Fetch", uqrVar);
        this.i = builder3.build();
        ImmutableMap.builder().build();
    }

    @Override // defpackage.uqs
    public final rmp a() {
        return e;
    }

    @Override // defpackage.uqs
    public final rmp b() {
        return g;
    }

    @Override // defpackage.uqs
    public final uqr c(String str) {
        String str2 = f.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ImmutableMap immutableMap = this.i;
        if (immutableMap.containsKey(strSubstring)) {
            return (uqr) immutableMap.get(strSubstring);
        }
        return null;
    }

    @Override // defpackage.uqs
    public final List d() {
        return this.h;
    }
}
