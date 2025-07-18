package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqv implements xcm {
    private final /* synthetic */ int a;

    public kqv(int i) {
        this.a = i;
    }

    public static final yow a() {
        yot yotVar = ypk.a;
        return yoz.l(yxi.a);
    }

    public static wjo c() {
        wjo wjoVar = wjo.MOBILE;
        wjoVar.getClass();
        return wjoVar;
    }

    public static final Boolean d() {
        return false;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.a) {
            case 0:
                throw null;
            case 1:
                return new ThreadPoolExecutor(4, 4, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rna("network", 10, 1));
            case 2:
                return new ljj();
            case 3:
                return new lld();
            case 4:
                return new lnc();
            case 5:
                ImmutableMap.Builder builder = new ImmutableMap.Builder();
                loy loyVar = loy.a;
                builder.put("google.internal.play.movies.dfe.v1beta.discovery.DiscoveryService/GetRelated", loyVar);
                builder.put("google.internal.play.movies.dfe.v1beta.metadata.MetadataService/FetchAsset", loy.b);
                builder.put("google.internal.play.movies.dfe.v1beta.userdata.UserDataService/Fetch", loyVar);
                builder.put("google.internal.play.movies.dfe.v1beta.commerce.CommerceService/FetchLibrary", loyVar);
                builder.put("google.internal.play.movies.dfe.v1beta.pagination.PaginationService/FetchByToken", loyVar);
                builder.put("google.internal.play.movies.dfe.v1beta.config.ConfigService/Fetch", loyVar);
                builder.put("google.internal.play.movies.dfe.v1beta.discovery.DiscoveryService/GetFeed", loy.c);
                builder.put("wireless.android.tv.gtvm.GoogleTvMobileFrontendService/GetUserProfile", loyVar);
                builder.put("wireless.android.tv.gtvm.GoogleTvMobileFrontendService/GetMediaProviders", loyVar);
                ImmutableMap immutableMapBuildOrThrow = builder.buildOrThrow();
                immutableMapBuildOrThrow.getClass();
                return immutableMapBuildOrThrow;
            case 6:
                return new krh(null);
            case 7:
                Locale locale = Locale.getDefault();
                locale.getClass();
                return locale;
            case 8:
                return c();
            case 9:
                throw null;
            case 10:
                return new ehq(5);
            case 11:
                return new mku();
            case 12:
                return new mky();
            case 13:
                return new mld();
            case 14:
                return new mnw();
            case 15:
                return new moe();
            case 16:
                return new mol();
            case 17:
                return new mou();
            case 18:
                return new mpc();
            case 19:
                return new mpm();
            default:
                return new osk();
        }
    }
}
