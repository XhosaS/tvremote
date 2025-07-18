package defpackage;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lxt implements idf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lxt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v26, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, yjv] */
    @Override // defpackage.idf
    public final Object b(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                return ((kta) this.a).e((List) obj);
            case 1:
                return ((kta) this.a).c((List) obj);
            case 2:
                return ((kta) this.a).d((List) obj);
            case 3:
                return ((kta) this.a).a((List) obj);
            case 4:
                return ((kta) this.a).e((List) obj);
            case 5:
                return ((kta) this.a).d((List) obj);
            case 6:
                return ((kta) this.a).f((List) obj);
            case 7:
                return ((kta) this.a).d((List) obj);
            case 8:
                return ieg.a((xax) this.a.get((ksy) obj));
            case 9:
                return ((lys) this.a).c((ieg) obj);
            case 10:
                return ((lys) this.a).d((ksn) obj);
            case 11:
                Pair pair = (Pair) obj;
                try {
                    return ieg.f(new File(new File(kfw.M((Context) this.a, ((Integer) pair.second).intValue()), "storyboard"), ((String) pair.first) + ".1.stb"));
                } catch (lkb e) {
                    return ieg.b(e);
                }
            case 12:
                return mak.a((maj) obj, this.a);
            case 13:
                maj majVar = (maj) obj;
                try {
                    return ieg.f(new File(new File(kfw.M((Context) this.a, majVar.b), "storyboard"), (String) majVar.e));
                } catch (lkb e2) {
                    return ieg.b(e2);
                }
            case 14:
                return mak.a((maj) obj, this.a);
            case 15:
                Pair pair2 = (Pair) obj;
                kwx kwxVar = (kwx) pair2.first;
                int iFileVersion = kwxVar.fileVersion();
                Object obj2 = this.a;
                if (iFileVersion < 5) {
                    str = kwxVar.videoId() + "." + kwxVar.languageCode() + ".cc";
                } else {
                    str = kwxVar.videoId() + "." + krh.e(kwxVar.url()) + ".v5";
                }
                try {
                    return ieg.f(new File(new File(kfw.M(((man) obj2).d, ((Integer) pair2.second).intValue()), "subtitles"), str));
                } catch (lkb e3) {
                    return ieg.b(e3);
                }
            case 16:
                Pair pair3 = (Pair) obj;
                try {
                    return ieg.f(new File(new File(kfw.M(((man) this.a).d, ((Integer) pair3.second).intValue()), "subtitles"), ((String) pair3.first) + ".cc"));
                } catch (lkb e4) {
                    return ieg.b(e4);
                }
            case 17:
                obj.getClass();
                return this.a.a(obj);
            case 18:
                mfq mfqVar = (mfq) this.a;
                return new mfo(false, obj, (String) mfqVar.b("ETag").c, (String) mfqVar.b("Last-Modified").c);
            case 19:
                mmk mmkVar = (mmk) this.a;
                return mmkVar.H.g(((ldy) mmkVar.j).a(), (ksy) obj);
            default:
                return Boolean.valueOf(((kxi) ((mmk) this.a).n.a()).a((ksy) obj));
        }
    }
}
