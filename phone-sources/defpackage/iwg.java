package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iwg implements yjv {
    private final /* synthetic */ int a;

    public /* synthetic */ iwg(int i) {
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                iwr iwrVar = (iwr) obj;
                tui tuiVar = iwu.a;
                iwrVar.getClass();
                iwrVar.o(0);
                iwrVar.m(null);
                return ygi.a;
            case 1:
                ((ith) obj).getClass();
                return true;
            case 2:
                iwr iwrVar2 = (iwr) obj;
                tui tuiVar2 = iwu.a;
                iwrVar2.getClass();
                iwrVar2.o(iwrVar2.d() + 1);
                iwrVar2.j(ivy.d);
                return ygi.a;
            case 3:
                iwr iwrVar3 = (iwr) obj;
                iwrVar3.getClass();
                iwrVar3.l(true);
                iwrVar3.o(0);
                iwrVar3.j(ivy.g);
                return ygi.a;
            case 4:
                iwr iwrVar4 = (iwr) obj;
                iwrVar4.getClass();
                iwrVar4.l(false);
                iwrVar4.j(ivy.c);
                return ygi.a;
            case 5:
                wkx wkxVar = iyd.a;
                ((ixh) obj).getClass();
                return true;
            case 6:
                vtw vtwVar = (vtw) obj;
                vtwVar.getClass();
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                iod iodVar = (iod) vtwVar.b;
                iod iodVar2 = iod.a;
                iodVar.i = true;
                return ygi.a;
            case 7:
                Throwable th = (Throwable) obj;
                ((tug) izs.a.b().h(tvo.a, "[GTVM-LibWorker]").j("com/google/android/apps/googletv/app/library/impl/LibrarySyncWorker", "doWork$lambda$1", 61, "LibrarySyncWorker.kt")).v("%s", th != null ? th.getMessage() : null);
                return ygi.a;
            case 8:
                vtw vtwVar2 = (vtw) obj;
                int i = izz.a;
                vtwVar2.getClass();
                if (!vtwVar2.b.A()) {
                    vtwVar2.u();
                }
                iod iodVar3 = (iod) vtwVar2.b;
                iod iodVar4 = iod.a;
                iodVar3.u = true;
                return ygi.a;
            case 9:
                ((dav) obj).getClass();
                wnf wnfVar = wnf.a;
                wnfVar.getClass();
                return wnfVar;
            case 10:
                iod iodVar5 = (iod) obj;
                iodVar5.getClass();
                wjz wjzVar = iodVar5.r;
                return wjzVar == null ? wjz.a : wjzVar;
            case 11:
                iod iodVar6 = (iod) obj;
                iodVar6.getClass();
                return Boolean.valueOf(iodVar6.s);
            case 12:
                iod iodVar7 = (iod) obj;
                iodVar7.getClass();
                return Boolean.valueOf(iodVar7.t);
            case 13:
                Throwable th2 = (Throwable) obj;
                krd.b(th2 != null ? th2.getMessage() : null);
                return ygi.a;
            case 14:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                return th3.getCause();
            case 15:
                ((Integer) obj).intValue();
                return ygi.a;
            case 16:
                Exception exc = (Exception) obj;
                tui tuiVar3 = jlw.a;
                exc.getClass();
                ((tug) ((tug) jlw.a.g().h(tvo.a, "[GTVM-Kinetoscope]")).i(exc).j("com/google/android/apps/googletv/app/presentation/components/entity/title/TitlePresenter", "openTrailer$lambda$16", 346, "TitlePresenter.kt")).s("Failed to start trailer playback with Kinetoscope Player");
                return ygi.a;
            case 17:
                Exception exc2 = (Exception) obj;
                tui tuiVar4 = jlw.a;
                exc2.getClass();
                ((tug) ((tug) jlw.a.g().h(tvo.a, "[GTVM-Kinetoscope]")).i(exc2).j("com/google/android/apps/googletv/app/presentation/components/entity/title/TitlePresenter", "openTrailer$lambda$17", 350, "TitlePresenter.kt")).s("Failed to start trailer playback with ExoPlayer library");
                return ygi.a;
            case 18:
                iod iodVar8 = (iod) obj;
                iodVar8.getClass();
                return Integer.valueOf(Objects.hash(iodVar8.h));
            case 19:
                iod iodVar9 = (iod) obj;
                iodVar9.getClass();
                return iodVar9.f;
            default:
                iod iodVar10 = (iod) obj;
                iodVar10.getClass();
                return Integer.valueOf(Objects.hash(iodVar10.h, Boolean.valueOf(iodVar10.c)));
        }
    }
}
