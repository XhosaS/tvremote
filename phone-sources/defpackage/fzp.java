package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.apps.googletv.app.presentation.pages.search.v2.SearchQueryPageActivity;
import com.google.android.videos.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzp extends yiz implements yjz {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzp(Context context, String str, File file, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = context;
        this.a = str;
        this.c = file;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((fzp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((fzp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((fzp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((fzp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((fzp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((fzp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((fzp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((fzp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((fzp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 9:
                return ((fzp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((fzp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [ewb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.d) {
            case 0:
                Object obj2 = this.a;
                return new fzp((gez) obj2, (mdw) this.b, (fzx) this.c, yihVar, 0);
            case 1:
                return new fzp((bdy) this.b, (fyg) this.a, (bje) this.c, yihVar, 1);
            case 2:
                Object obj3 = this.a;
                return new fzp((gbb) obj3, (fzx) this.c, (fzv) this.b, yihVar, 2);
            case 3:
                Object obj4 = this.c;
                return new fzp((igf) obj4, (ihz) this.a, (Context) this.b, yihVar, 3);
            case 4:
                Object obj5 = this.b;
                return new fzp((Bitmap) obj5, (ioy) this.c, (String) this.a, yihVar, 4);
            case 5:
                Object obj6 = this.b;
                return new fzp((Context) obj6, (String) this.a, (File) this.c, yihVar, 5);
            case 6:
                Object obj7 = this.c;
                return new fzp((SearchQueryPageActivity) obj7, (kfh) this.a, (Context) this.b, yihVar, 6);
            case 7:
                return new fzp((ovv) this.a, (ewb) this.b, (ovv) this.c, yihVar, 7);
            case 8:
                Object obj8 = this.a;
                return new fzp((uxd) obj8, (pgb) this.c, (oyd) this.b, yihVar, 8);
            case 9:
                Object obj9 = this.b;
                return new fzp((qku) obj9, (vmd) this.c, (String) this.a, yihVar, 9);
            default:
                Object obj10 = this.c;
                return new fzp((qli) obj10, (qel) this.b, (List) this.a, yihVar, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [eam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v76, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v15, types: [ewb, java.lang.Object] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        int i = 10;
        boolean z = false;
        switch (this.d) {
            case 0:
                ybn.f(obj);
                Object obj2 = this.a;
                if (obj2 instanceof gbn) {
                    ((mdw) this.b).t((fzx) this.c, (gbn) obj2);
                } else if (obj2 instanceof gbl) {
                    Object obj3 = this.b;
                    Object obj4 = this.c;
                    Throwable th = ((gbl) obj2).a;
                    mdw mdwVar = (mdw) obj3;
                    if (!mdwVar.w()) {
                        ((gba) mdwVar.f).a((fzx) obj4, new fzs(th));
                    }
                } else {
                    if (!(obj2 instanceof gbm)) {
                        throw new yfu();
                    }
                    mdw mdwVar2 = (mdw) this.b;
                    ((gbo) mdwVar2.d).d();
                    mdwVar2.s();
                }
                return ygi.a;
            case 1:
                ybn.f(obj);
                for (fwr fwrVar : fus.G(this.b)) {
                    Object obj5 = this.a;
                    fyg fygVar = (fyg) obj5;
                    if (!((List) fygVar.d().d()).contains(fwrVar) && !((bje) this.c).contains(fwrVar)) {
                        fygVar.h(fwrVar);
                    }
                }
                return ygi.a;
            case 2:
                ybn.f(obj);
                fyh fyhVar = new fyh(i);
                List list = ((gbb) this.a).j;
                yfm.L(list, fyhVar);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    yjz yjzVar = (yjz) ((WeakReference) it.next()).get();
                    if (yjzVar != null) {
                        yjzVar.a(this.c, this.b);
                    }
                }
                return ygi.a;
            case 3:
                ybn.f(obj);
                wkg wkgVar = ((wob) ((iht) this.a).a).b;
                if (wkgVar == null) {
                    wkgVar = wkg.a;
                }
                Object obj6 = this.c;
                wkgVar.getClass();
                ((igf) obj6).d.e(wkgVar, (Context) this.b, "");
                return ygi.a;
            case 4:
                ybn.f(obj);
                Object obj7 = this.b;
                Bitmap bitmap = (Bitmap) obj7;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
                byteBufferAllocate.getClass();
                bitmap.copyPixelsToBuffer(byteBufferAllocate);
                byteBufferAllocate.rewind();
                int iHashCode = Arrays.hashCode(byteBufferAllocate.array());
                Object obj8 = this.a;
                ioy ioyVar = (ioy) this.c;
                ConcurrentHashMap concurrentHashMap = ioyVar.d;
                if (!concurrentHashMap.containsKey(obj8)) {
                    ((tug) ioy.a.b().j("com/google/android/apps/googletv/app/data/store/impl/InMemoryDynamicColorStoreImpl$getDominantColors$2", "invokeSuspend", 50, "InMemoryDynamicColorStoreImpl.kt")).v("Cache miss for posterUrl=%s", obj8);
                    ?? A = ioyVar.c.a(obj7, true);
                    concurrentHashMap.put(obj8, new iox(iHashCode, A));
                    return A;
                }
                iox ioxVar = (iox) concurrentHashMap.get(obj8);
                if (ioxVar == null || ioxVar.a != iHashCode) {
                    ((tug) ioy.a.b().j("com/google/android/apps/googletv/app/data/store/impl/InMemoryDynamicColorStoreImpl$getDominantColors$2", "invokeSuspend", 44, "InMemoryDynamicColorStoreImpl.kt")).v("Cache hit with hashCode mismatch for posterUrl=%s", obj8);
                    ?? A2 = ioyVar.c.a(obj7, true);
                    concurrentHashMap.put(obj8, new iox(iHashCode, A2));
                    return A2;
                }
                ((tug) ioy.a.b().j("com/google/android/apps/googletv/app/data/store/impl/InMemoryDynamicColorStoreImpl$getDominantColors$2", "invokeSuspend", 41, "InMemoryDynamicColorStoreImpl.kt")).v("Cache hit with hashCode match for posterUrl=%s", obj8);
                iox ioxVar2 = (iox) concurrentHashMap.get(obj8);
                List list2 = ioxVar2 != null ? ioxVar2.b : null;
                list2.getClass();
                return list2;
            case 5:
                ybn.f(obj);
                File file = (File) hjr.c((Context) this.b).d().f(this.a).j(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
                FileOutputStream fileOutputStream = new FileOutputStream((File) this.c);
                try {
                    file.getClass();
                    fileOutputStream.write(wef.t(file));
                    wef.v(fileOutputStream, null);
                    return ygi.a;
                } finally {
                }
            case 6:
                ybn.f(obj);
                if (((Boolean) xhh.a.e(2, "AppRefreshFeature__enable_search_page_enhancement", false).et(((xhh) ((jxs) this.c).B()).b)).booleanValue()) {
                    Object obj9 = this.a;
                    Object obj10 = this.b;
                    obj10.getClass();
                    Context context = (Context) obj10;
                    String string = context.getString(R.string.search_genre_action);
                    string.getClass();
                    String string2 = context.getString(R.string.search_genre_animated);
                    string2.getClass();
                    String string3 = context.getString(R.string.search_genre_comedy);
                    string3.getClass();
                    String string4 = context.getString(R.string.search_genre_documentary);
                    string4.getClass();
                    String string5 = context.getString(R.string.search_genre_drama);
                    string5.getClass();
                    String string6 = context.getString(R.string.search_genre_family);
                    string6.getClass();
                    String string7 = context.getString(R.string.search_genre_fantasy);
                    string7.getClass();
                    String string8 = context.getString(R.string.search_genre_horror);
                    string8.getClass();
                    String string9 = context.getString(R.string.search_genre_mystery);
                    string9.getClass();
                    String string10 = context.getString(R.string.search_genre_romance);
                    string10.getClass();
                    String string11 = context.getString(R.string.search_genre_science_fiction);
                    string11.getClass();
                    String string12 = context.getString(R.string.search_genre_thriller);
                    string12.getClass();
                    ((kfh) obj9).j.e(yfm.s(new kel(string, "https://tv.google/static/images/searchgenre/action.jpeg"), new kel(string2, "https://tv.google/static/images/searchgenre/animated.jpeg"), new kel(string3, "https://tv.google/static/images/searchgenre/comedy.jpeg"), new kel(string4, "https://tv.google/static/images/searchgenre/documentary.jpeg"), new kel(string5, "https://tv.google/static/images/searchgenre/drama.jpeg"), new kel(string6, "https://tv.google/static/images/searchgenre/family.jpeg"), new kel(string7, "https://tv.google/static/images/searchgenre/fantasy.jpeg"), new kel(string8, "https://tv.google/static/images/searchgenre/horror.jpeg"), new kel(string9, "https://tv.google/static/images/searchgenre/mystery.jpeg"), new kel(string10, "https://tv.google/static/images/searchgenre/romance.jpeg"), new kel(string11, "https://tv.google/static/images/searchgenre/scifi.jpeg"), new kel(string12, "https://tv.google/static/images/searchgenre/thriller.jpeg")));
                }
                return ygi.a;
            case 7:
                ybn.f(obj);
                ovv ovvVar = (ovv) this.a;
                ExoPlayer exoPlayer = ovvVar.d;
                if (exoPlayer != 0) {
                    exoPlayer.as(this.b);
                }
                yjk yjkVar = ovvVar.e;
                if (yjkVar != null) {
                    yjkVar.a();
                }
                ovvVar.e = null;
                ExoPlayer exoPlayer2 = ovvVar.d;
                if (exoPlayer2 != 0) {
                    exoPlayer2.S(this.c);
                }
                return ygi.a;
            case 8:
                ybn.f(obj);
                Object obj11 = this.a;
                if (obj11 != null) {
                    ((pgb) this.c).i.c((oyd) this.b, (uxd) obj11);
                }
                ((pgb) this.c).d((oyd) this.b);
                return ygi.a;
            case 9:
                ybn.f(obj);
                try {
                    qqk qqkVar = (qqk) ((qku) this.b).b.f();
                    if (qqkVar != null) {
                        Object obj12 = this.c;
                        switch ((vmd) obj12) {
                            case REGISTRATION_REASON_UNSPECIFIED:
                            case DEVICE_START:
                            case APP_UPDATED:
                            case ACCOUNT_CHANGED:
                            case SERVER_SYNC_INSTRUCTION:
                            case LOCALE_CHANGED:
                            case TIMEZONE_CHANGED:
                            case COLLABORATOR_API_CALL:
                            case GUNS_MIGRATION:
                            case REGISTRATION_ID_CHANGED:
                            case APP_BLOCK_STATE_CHANGED:
                            case CHANNEL_BLOCK_STATE_CHANGED:
                            case GROWTHKIT_PERIODIC_REGISTRATION:
                            case PERIODIC_REGISTRATION:
                            case GMSCORE_DEBUG:
                                qqkVar.a();
                                break;
                            default:
                                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(obj12))));
                        }
                    }
                } catch (Exception e) {
                    ((tvk) ((tvk) qku.a.g()).i(e)).s("Failed to execute YT pre-registration callback.");
                }
                return ygi.a;
            default:
                ybn.f(obj);
                ?? r11 = this.a;
                qel qelVar = (qel) this.b;
                boolean zA = qelVar.a();
                boolean zB = qelVar.b();
                if ((r11 instanceof Collection) && r11.isEmpty()) {
                    z = true;
                } else {
                    Iterator it2 = r11.iterator();
                    while (it2.hasNext()) {
                        if (((qpv) it2.next()).b()) {
                        }
                    }
                    z = true;
                }
                return ((qli) this.c).f.a(new qju(zA, zB, z));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzp(Bitmap bitmap, ioy ioyVar, String str, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = bitmap;
        this.c = ioyVar;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzp(bdy bdyVar, fyg fygVar, bje bjeVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = bdyVar;
        this.a = fygVar;
        this.c = bjeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzp(SearchQueryPageActivity searchQueryPageActivity, kfh kfhVar, Context context, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = searchQueryPageActivity;
        this.a = kfhVar;
        this.b = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzp(gbb gbbVar, fzx fzxVar, fzv fzvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.a = gbbVar;
        this.c = fzxVar;
        this.b = fzvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzp(gez gezVar, mdw mdwVar, fzx fzxVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.a = gezVar;
        this.b = mdwVar;
        this.c = fzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzp(igf igfVar, ihz ihzVar, Context context, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = igfVar;
        this.a = ihzVar;
        this.b = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzp(ovv ovvVar, ewb ewbVar, ovv ovvVar2, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.a = ovvVar;
        this.b = ewbVar;
        this.c = ovvVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzp(qku qkuVar, vmd vmdVar, String str, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = qkuVar;
        this.c = vmdVar;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzp(qli qliVar, qel qelVar, List list, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.c = qliVar;
        this.b = qelVar;
        this.a = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzp(uxd uxdVar, pgb pgbVar, oyd oydVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.a = uxdVar;
        this.c = pgbVar;
        this.b = oydVar;
    }
}
