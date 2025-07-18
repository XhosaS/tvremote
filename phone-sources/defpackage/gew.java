package defpackage;

import android.graphics.Bitmap;
import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gew extends ykq implements yjz {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, byte[] bArr) {
        super(2, obj, rf.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, yfo] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        boolean zB;
        Integer num;
        Integer num2;
        int i = this.a;
        int iIntValue = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        switch (i) {
            case 0:
                return gez.b((gex) this.e, (yjv) obj, (yih) obj2);
            case 1:
                bmp bmpVar = (bmp) obj;
                bmp bmpVar2 = (bmp) obj2;
                rf rfVar = (rf) this.e;
                if (rfVar.A && (zB = bmpVar2.b()) != bmpVar.b()) {
                    yjv yjvVar = rfVar.a;
                    if (yjvVar != null) {
                        yjvVar.a(Boolean.valueOf(zB));
                    }
                    if (zB) {
                        ykr.q(rfVar.F(), null, 0, new qy(rfVar, (yih) null, 3), 3);
                        adi adiVarH = rfVar.h();
                        if (adiVarH != null) {
                            adiVarH.c();
                        } else {
                            adiVarH = null;
                        }
                        rfVar.c = adiVarH;
                        rfVar.b();
                    } else {
                        adi adiVar = rfVar.c;
                        if (adiVar != null) {
                            adiVar.a();
                        }
                        rfVar.c = null;
                        rg rgVarA = rfVar.a();
                        if (rgVarA != null) {
                            rgVarA.a(null);
                        }
                    }
                    cbp.M(rfVar);
                    kw kwVar = rfVar.e;
                    if (kwVar != null) {
                        if (zB) {
                            wl wlVar = rfVar.b;
                            if (wlVar != null) {
                                rfVar.i(kwVar, new wm(wlVar));
                                rfVar.b = null;
                            }
                            wl wlVar2 = new wl();
                            rfVar.i(kwVar, wlVar2);
                            rfVar.b = wlVar2;
                        } else {
                            wl wlVar3 = rfVar.b;
                            if (wlVar3 != null) {
                                rfVar.i(kwVar, new wm(wlVar3));
                                rfVar.b = null;
                            }
                        }
                    }
                }
                return ygi.a;
            case 2:
                return gez.b((gex) this.e, (yjv) obj, (yih) obj2);
            case 3:
                return ((iby) this.e).g((hjt) obj, (yih) obj2);
            case 4:
                imq imqVar = (imq) this.e;
                int i2 = imq.b;
                return imqVar.a((String) obj, (yih) obj2);
            case 5:
                ink inkVar = (ink) obj;
                yih yihVar = (yih) obj2;
                iom iomVar = (iom) this.e;
                Object obj3 = iomVar.a;
                String str = ((ksn) ((ldy) iomVar.b).a().g()).a;
                wvw wvwVar = inkVar.c == 16 ? (wvw) inkVar.d : wvw.a;
                wvwVar.getClass();
                kdj kdjVar = (kdj) obj3;
                return ((hfx) kdjVar.b.b()).c(new om(kdjVar, str, wvwVar, (yih) null, 6), yihVar);
            case 6:
                ink inkVar2 = (ink) obj;
                yih yihVar2 = (yih) obj2;
                kdj kdjVar2 = ((iop) this.e).c;
                wvy wvyVar = inkVar2.c == 8 ? (wvy) inkVar2.d : wvy.a;
                wvyVar.getClass();
                return ((hfx) kdjVar2.b.b()).c(new ahk(kdjVar2, wvyVar, (yih) null, 14), yihVar2);
            case 7:
                return ((kpt) this.e).a((Bitmap) obj, ((Boolean) obj2).booleanValue());
            case 8:
                ipe ipeVar = (ipe) obj;
                ipe ipeVar2 = (ipe) obj2;
                ipeVar.getClass();
                Integer num3 = ipeVar.i;
                int iIntValue2 = num3 != null ? num3.intValue() : 0;
                if (ipeVar2 != null && (num = ipeVar2.i) != null) {
                    iIntValue = num.intValue();
                }
                return Boolean.valueOf(iIntValue2 > iIntValue);
            case 9:
                ipe ipeVar3 = (ipe) obj;
                ipe ipeVar4 = (ipe) obj2;
                ipeVar3.getClass();
                Integer num4 = ipeVar3.i;
                if (num4 != null) {
                    iIntValue = num4.intValue();
                }
                return Boolean.valueOf(iIntValue < ((ipeVar4 == null || (num2 = ipeVar4.i) == null) ? 0 : num2.intValue()));
            case 10:
                ink inkVar3 = (ink) obj;
                yih yihVar3 = (yih) obj2;
                Object obj4 = ((irc) this.e).a;
                wzb wzbVar = inkVar3.c == 11 ? (wzb) inkVar3.d : wzb.a;
                wzbVar.getClass();
                kdj kdjVar3 = (kdj) obj4;
                return ((hfx) kdjVar3.b.b()).c(new iml(kdjVar3, wzbVar, (yih) null, 3), yihVar3);
            case 11:
                return ((isf) this.e).a((ink) obj, (yih) obj2);
            case 12:
                return ((isf) this.e).b((ink) obj, (yih) obj2);
            case 13:
                return ((isf) this.e).c((ink) obj, (yih) obj2);
            case 14:
                return ((isf) this.e).d((ink) obj, (yih) obj2);
            case 15:
                ink inkVar4 = (ink) obj;
                yih yihVar4 = (yih) obj2;
                kdj kdjVar4 = ((isf) this.e).j;
                wwo wwoVar = inkVar4.c == 14 ? (wwo) inkVar4.d : wwo.a;
                wwoVar.getClass();
                return ((hfx) kdjVar4.b.b()).c(new ahk(kdjVar4, wwoVar, (yih) null, 19), yihVar4);
            case 16:
                ink inkVar5 = (ink) obj;
                yih yihVar5 = (yih) obj2;
                kdj kdjVar5 = ((isf) this.e).j;
                wws wwsVar = inkVar5.c == 4 ? (wws) inkVar5.d : wws.a;
                wwsVar.getClass();
                return ((hfx) kdjVar5.b.b()).c(new ahk(kdjVar5, wwsVar, (yih) null, 20), yihVar5);
            case 17:
                return ((isf) this.e).e((ink) obj, (yih) obj2);
            case 18:
                return ((isf) this.e).f((ink) obj, (yih) obj2);
            case 19:
                return ((isf) this.e).g((ink) obj, (yih) obj2);
            default:
                ink inkVar6 = (ink) obj;
                yih yihVar6 = (yih) obj2;
                Object obj5 = ((isy) this.e).a;
                wxc wxcVar = inkVar6.c == 17 ? (wxc) inkVar6.d : wxc.a;
                wxcVar.getClass();
                kdj kdjVar6 = (kdj) obj5;
                return ((hfx) kdjVar6.b.b()).c(new ahk(kdjVar6, wxcVar, (yih) null, 12), yihVar6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i) {
        super(2, obj, gez.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, short[] sArr) {
        super(2, obj, iby.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, int[] iArr) {
        super(2, obj, imq.class, "fetchPlayCountry", "fetchPlayCountry(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, boolean[] zArr) {
        super(2, obj, iom.class, "fetchCommunicationPreferences", "fetchCommunicationPreferences(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, float[] fArr) {
        super(2, obj, iop.class, "fetchDestinations", "fetchDestinations(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, byte[][] bArr) {
        super(2, obj, kpt.class, "getDominantColors", "getDominantColors(Landroid/graphics/Bitmap;Z)Ljava/util/List;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, char[][] cArr) {
        super(2, obj, ipc.class, "NEXT_EPISODES_FILTER_CONDITION", "NEXT_EPISODES_FILTER_CONDITION(Lcom/google/android/apps/googletv/app/data/store/impl/MediaLibraryStoreImpl$LibraryStoreItem;Lcom/google/android/apps/googletv/app/data/store/impl/MediaLibraryStoreImpl$LibraryStoreItem;)Z", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, short[][] sArr) {
        super(2, obj, ipc.class, "PREVIOUS_EPISODES_FILTER_CONDITION", "PREVIOUS_EPISODES_FILTER_CONDITION(Lcom/google/android/apps/googletv/app/data/store/impl/MediaLibraryStoreImpl$LibraryStoreItem;Lcom/google/android/apps/googletv/app/data/store/impl/MediaLibraryStoreImpl$LibraryStoreItem;)Z", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, int[][] iArr) {
        super(2, obj, irc.class, "fetchResolveLinkResponse", "fetchResolveLinkResponse(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, boolean[][] zArr) {
        super(2, obj, isf.class, "fetchSearchStream", "fetchSearchStream(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, float[][] fArr) {
        super(2, obj, isf.class, "fetchStreamByRefreshToken", "fetchStreamByRefreshToken(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, byte[][][] bArr) {
        super(2, obj, isf.class, "getMediaProviderSelectionStream", "getMediaProviderSelectionStream(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, char[][][] cArr) {
        super(2, obj, isf.class, "getPostPurchaseDialogStream", "getPostPurchaseDialogStream(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, short[][][] sArr) {
        super(2, obj, isf.class, "getPrePurchaseDialogStream", "getPrePurchaseDialogStream(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, int[][][] iArr) {
        super(2, obj, isf.class, "fetchSearchSuggestionsStream", "fetchSearchSuggestionsStream(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, boolean[][][] zArr) {
        super(2, obj, isf.class, "getTvEntityPurchaseStream", "getTvEntityPurchaseStream(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, float[][][] fArr) {
        super(2, obj, isf.class, "getTvmEntityMenuStream", "getTvmEntityMenuStream(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, byte[] bArr, byte[] bArr2) {
        super(2, obj, isf.class, "getTvmEntityStream", "getTvmEntityStream(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(Object obj, int i, char[] cArr, byte[] bArr) {
        super(2, obj, isy.class, "fetchWidgets", "fetchWidgets(Lcom/google/android/apps/googletv/app/data/store/CacheKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }
}
