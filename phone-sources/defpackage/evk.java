package defpackage;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards.CardStackRecyclerView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class evk implements ttm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ evk(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [eer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v5, types: [eer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r2v7, types: [eer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, yfo] */
    @Override // defpackage.ttm
    public final Object get() {
        switch (this.c) {
            case 0:
                return evm.a((Class) this.a, this.b);
            case 1:
                return evm.a((Class) this.a, this.b);
            case 2:
                return evm.a((Class) this.a, this.b);
            case 3:
                return new ewr(this.b, ((evl) this.a).a);
            case 4:
                return new ocl((Context) this.b, (ocf) this.a);
            case 5:
                Object obj = this.b;
                obj.getClass();
                return ((rdd) ((aafi) this.a).a).n((ViewGroup) obj);
            case 6:
                return ((cb) ((aafi) this.a).b).P((ViewGroup) this.b);
            case 7:
                return ((cb) ((yyh) this.a).c).P((ViewGroup) this.b);
            case 8:
                View viewFindViewById = ((ViewGroup) this.b).findViewById(R.id.og_bento_account_management_container);
                viewFindViewById.getClass();
                ViewGroup viewGroup = (ViewGroup) viewFindViewById;
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_account_management_content, viewGroup);
                viewInflate.getClass();
                aafi aafiVar = (aafi) ((yyh) this.a).e;
                Object objB = aafiVar.a.b();
                Context context = viewGroup.getContext();
                context.getClass();
                ssp sspVar = new ssp(context);
                sspVar.a(sip.d(context, R.attr.colorSurfaceContainer, 0));
                sspVar.a = context.getResources().getDimensionPixelSize(R.dimen.bento_divider_thickness);
                sspVar.b = true;
                RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.accounts);
                recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
                recyclerView.setAdapter((RecyclerView.Adapter) objB);
                recyclerView.setNestedScrollingEnabled(false);
                recyclerView.addItemDecoration(sspVar);
                Object objB2 = aafiVar.b.b();
                CardStackRecyclerView cardStackRecyclerView = (CardStackRecyclerView) viewInflate.findViewById(R.id.account_management_actions);
                cardStackRecyclerView.setAdapter((RecyclerView.Adapter) objB2);
                ((LinearLayout) viewInflate.findViewById(R.id.account_management_expandable_content)).getLayoutTransition().setDuration(200L);
                ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.og_bento_account_management_header_container);
                View viewFindViewById2 = viewInflate.findViewById(R.id.og_account_management_content_root);
                viewFindViewById2.getClass();
                viewGroup2.getClass();
                Object objB3 = ((cb) aafiVar.c).a.b();
                View viewInflate2 = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.og_bento_account_management_header, viewGroup2);
                viewInflate2.getClass();
                RecyclerView recyclerView2 = (RecyclerView) viewInflate2.findViewById(R.id.header_avatars);
                recyclerView2.setLayoutManager(new LinearLayoutManager(viewGroup2.getContext(), 0, false));
                recyclerView2.setAdapter((RecyclerView.Adapter) objB3);
                recyclerView2.setVisibility(8);
                recyclerView2.setItemAnimator(null);
                ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.og_collapsed_chevron);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(sip.d(viewGroup2.getContext(), R.attr.colorSurfaceContainer, 0));
                int[] iArr = cww.a;
                imageView.setBackground(shapeDrawable);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, 360.0f, 180.0f);
                objectAnimatorOfFloat.setDuration(200L);
                recyclerView2.getClass();
                imageView.getClass();
                objectAnimatorOfFloat.getClass();
                View viewFindViewById3 = viewInflate2.findViewById(R.id.og_bento_switch_account_header);
                viewFindViewById3.getClass();
                rah rahVar = new rah((rbd) objB3, recyclerView2, imageView, objectAnimatorOfFloat, (TextView) viewFindViewById3);
                recyclerView.getClass();
                cardStackRecyclerView.getClass();
                View viewFindViewById4 = viewInflate.findViewById(R.id.account_management_header_divider);
                viewFindViewById4.getClass();
                rap rapVar = new rap((ViewGroup) viewFindViewById2, rahVar, viewGroup2, (raf) objB, recyclerView, cardStackRecyclerView, (rcb) objB2, viewFindViewById4);
                viewGroup2.getLayoutTransition().setDuration(200L);
                return rapVar;
            case 9:
                return ((cb) ((yyh) this.a).c).P((ViewGroup) this.b);
            case 10:
                return ((cb) ((yyh) this.a).c).P((ViewGroup) this.b);
            case 11:
                return ((cb) ((yyh) this.a).c).P((ViewGroup) this.b);
            case 12:
                ViewGroup viewGroup3 = (ViewGroup) this.b;
                View viewInflate3 = LayoutInflater.from(viewGroup3.getContext()).inflate(R.layout.og_bento_product_space, viewGroup3);
                RecyclerView recyclerView3 = (RecyclerView) viewInflate3.findViewById(R.id.og_bento_product_space_card_stacks);
                Object obj2 = ((cb) ((yyh) this.a).d).a;
                recyclerView3.setAdapter((RecyclerView.Adapter) obj2);
                RecyclerView.ItemAnimator itemAnimator = recyclerView3.getItemAnimator();
                SimpleItemAnimator simpleItemAnimator = itemAnimator instanceof SimpleItemAnimator ? (SimpleItemAnimator) itemAnimator : null;
                if (simpleItemAnimator != null) {
                    simpleItemAnimator.setSupportsChangeAnimations(false);
                }
                View viewFindViewById5 = viewInflate3.findViewById(R.id.og_bento_product_space_title);
                viewFindViewById5.getClass();
                return new rbi((TextView) viewFindViewById5, obj2);
            case 13:
                return ((rdd) ((cb) this.a).a).n((ViewGroup) this.b);
            case 14:
                ViewGroup viewGroup4 = (ViewGroup) this.b;
                View viewInflate4 = LayoutInflater.from(viewGroup4.getContext()).inflate(R.layout.og_bento_trailing_pair_content, viewGroup4, false);
                viewInflate4.getClass();
                ViewGroup viewGroup5 = (ViewGroup) viewInflate4;
                viewGroup4.addView(viewGroup5);
                ViewGroup viewGroup6 = (ViewGroup) viewGroup5.findViewById(R.id.og_bento_card_trailing_pair_first_container);
                ViewGroup viewGroup7 = (ViewGroup) viewGroup5.findViewById(R.id.og_bento_card_trailing_pair_second_container);
                viewGroup6.getClass();
                rdd rddVar = (rdd) this.a;
                goe goeVarN = rddVar.n(viewGroup6);
                viewGroup7.getClass();
                return new vvd(viewGroup5, viewGroup6, goeVarN, rddVar.n(viewGroup7));
            case 15:
                Object obj3 = this.b;
                return new riv(this.a, new aafi((Context) obj3, "STREAMZ_ONEGOOGLE_ANDROID"), obj3 instanceof Application ? (Application) obj3 : null);
            case 16:
                rjr rjrVar = (rjr) this.a;
                Context applicationContext = rjrVar.a.getApplicationContext();
                ExecutorService executorService = rjrVar.b;
                applicationContext.getClass();
                executorService.getClass();
                ydk ydkVar = new ydk(null);
                ydkVar.a = 641;
                ocv.au(true, "Must provide valid client application ID!");
                ojk ojkVar = new ojk(ydkVar);
                jzs jzsVar = ojl.b;
                nwp nwpVar = nwp.a;
                return new rla(new rku(applicationContext, new nwq(applicationContext, jzsVar, ojkVar, nwpVar), new ojh(applicationContext, ojkVar), new nwq(applicationContext, jzsVar, ojkVar, nwpVar), new rjl(applicationContext, executorService), executorService, nvj.a), 2, (rzy) this.b, applicationContext.getPackageName(), 0);
            case 17:
                Object obj4 = this.b;
                synchronized (this.a) {
                    String strB = rpd.b();
                    String str = strB + ".trace";
                    File file = new File(((Context) obj4).getFilesDir(), a.cr(strB, "primes_profiling_"));
                    if (!file.exists() && !file.mkdir()) {
                        ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "<init>", android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar, "CpuProfilingService.java")).s("Could not create directory");
                        return trk.a;
                    }
                    File file2 = new File(file, str);
                    file2.deleteOnExit();
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                    } catch (RuntimeException e) {
                        ((tug) ((tug) ((tug) rnb.a.b()).i(e)).j("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", (char) 368, "CpuProfilingService.java")).s("Exception when clearing trace file.");
                    }
                    return tst.i(file2);
                }
            case 18:
                int i = ruo.g;
                return ((ulp) this.b).aG(((ruk) this.a.b()).a);
            case 19:
                return ((tzs) ((aafi) this.b).c).i(((vsz) this.a).w());
            default:
                Object obj5 = ((ulp) this.a).a;
                Object obj6 = ((unc) obj5).d;
                nsw nswVar = (nsw) this.b;
                String str2 = nswVar.j;
                String str3 = nswVar.i;
                synchronized (obj6) {
                    Map map = (Map) ((unc) obj5).f.get(new tsu(str2, str3));
                    if (map == null) {
                        return ImmutableSet.of();
                    }
                    ImmutableSet.Builder builder = ImmutableSet.builder();
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        builder.addAll((Iterable) it.next());
                    }
                    return builder.build();
                }
        }
    }

    public /* synthetic */ evk(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
