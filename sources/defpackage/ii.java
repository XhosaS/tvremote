package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import android.os.Process;
import android.support.v7.app.AlertController$RecycleListView;
import android.support.v7.widget.RecyclerView;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.tv.remote.service.R;
import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ii {
    private static Field a;
    private static boolean b;
    private static Class c;
    private static boolean d;
    private static Field e;
    private static boolean f;
    private static Field g;
    private static boolean h;

    public ii() {
    }

    public static Intent A(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strC = C(activity);
        if (strC == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strC);
        try {
            return D(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", b.c(strC, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
            return null;
        }
    }

    public static Intent B(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strD = D(context, componentName);
        if (strD == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strD);
        return D(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String C(Activity activity) {
        try {
            return D(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String D(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        return string.charAt(0) == '.' ? String.valueOf(context.getPackageName()).concat(string) : string;
    }

    public static int E(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    public static int F(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    static void G(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof kd) {
                editorInfo.hintText = ((kd) parent).a();
                return;
            }
        }
    }

    public static int H(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public static void I(Context context) throws Resources.NotFoundException {
        context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public static Drawable J(Context context, int i) {
        return jd.e().c(context, i);
    }

    public static void K(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Object obj;
        if (!h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            h = true;
        }
        Field field = g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj != null) {
            if (!b) {
                try {
                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                    a = declaredField2;
                    declaredField2.setAccessible(true);
                } catch (NoSuchFieldException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                }
                b = true;
            }
            Field field2 = a;
            if (field2 != null) {
                try {
                    obj2 = field2.get(obj);
                } catch (IllegalAccessException e5) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                }
            }
            if (obj2 != null) {
                d(obj2);
            }
        }
    }

    public static oi L(Configuration configuration) {
        return oi.c(configuration.getLocales().toLanguageTags());
    }

    public static void M(Configuration configuration, oi oiVar) {
        configuration.setLocales(LocaleList.forLanguageTags(oiVar.e()));
    }

    public static bq N(bm bmVar, int i) {
        Context context = bmVar.a;
        bq bqVar = new bq(context, i);
        bp bpVar = bqVar.a;
        View view = bmVar.e;
        if (view != null) {
            bpVar.o = view;
        } else {
            CharSequence charSequence = bmVar.d;
            if (charSequence != null) {
                bpVar.a(charSequence);
            }
            Drawable drawable = bmVar.c;
            if (drawable != null) {
                bpVar.k = drawable;
                bpVar.j = 0;
                ImageView imageView = bpVar.l;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    bpVar.l.setImageDrawable(drawable);
                }
            }
        }
        if (bmVar.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bmVar.b.inflate(bpVar.t, (ViewGroup) null);
            int i2 = bmVar.i ? bpVar.u : bpVar.v;
            ListAdapter boVar = bmVar.g;
            if (boVar == null) {
                boVar = new bo(context, i2);
            }
            bpVar.p = boVar;
            bpVar.q = bmVar.j;
            if (bmVar.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new bl(bmVar, bpVar));
            }
            if (bmVar.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            bpVar.e = alertController$RecycleListView;
        }
        bqVar.setCancelable(true);
        bqVar.setCanceledOnTouchOutside(true);
        bqVar.setOnCancelListener(null);
        bqVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = bmVar.f;
        if (onKeyListener != null) {
            bqVar.setOnKeyListener(onKeyListener);
        }
        return bqVar;
    }

    public static Object O(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return bundle.getParcelable(str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static /* synthetic */ String P(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static void Q(int i, View view, ViewGroup viewGroup) {
        if (am.S(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int i2 = i - 1;
        if (i2 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (am.S(2)) {
                    Log.v("FragmentManager", b.d(viewGroup2, view, "SpecialEffectsController: Removing view ", " from container "));
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (am.S(2)) {
                    Log.v("FragmentManager", b.b(view, "SpecialEffectsController: Setting view ", " to INVISIBLE"));
                }
                view.setVisibility(4);
                return;
            } else {
                if (am.S(2)) {
                    Log.v("FragmentManager", b.b(view, "SpecialEffectsController: Setting view ", " to GONE"));
                }
                view.setVisibility(8);
                return;
            }
        }
        if (am.S(2)) {
            Log.v("FragmentManager", b.b(view, "SpecialEffectsController: Setting view ", " to VISIBLE"));
        }
        ViewParent parent2 = view.getParent();
        if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
            if (am.S(2)) {
                Log.v("FragmentManager", b.d(viewGroup, view, "SpecialEffectsController: Adding view ", " to Container "));
            }
            viewGroup.addView(view);
        }
        view.setVisibility(0);
    }

    public static int R(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(b.e(i, "Unknown visibility "));
    }

    public static int S(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return R(view.getVisibility());
    }

    public static /* synthetic */ String T(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ void U() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ PorterDuff.Mode V(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static /* synthetic */ void W(ExecutorService executorService) throws InterruptedException {
        if (executorService == ForkJoinPool.commonPool() || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ boolean X(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ int Z(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int aa(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int ab(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ void ac(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean ad(int i) {
        return Z(i) != 0;
    }

    public static bf ae(ViewGroup viewGroup, ii iiVar) {
        iiVar.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof bf) {
            return (bf) tag;
        }
        bf bfVar = new bf(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, bfVar);
        return bfVar;
    }

    public static awy af(Context context, q qVar, boolean z, boolean z2) throws Resources.NotFoundException {
        int iC;
        boolean z3;
        o oVar = qVar.O;
        int iE = 0;
        int i = oVar == null ? 0 : oVar.f;
        if (z2) {
            if (z) {
                iC = qVar.d();
                z3 = true;
            } else {
                iC = qVar.e();
                z3 = false;
            }
        } else if (z) {
            iC = qVar.b();
            z3 = true;
        } else {
            iC = qVar.c();
            z3 = false;
        }
        boolean z4 = z3;
        qVar.v(0, 0, 0, 0);
        ViewGroup viewGroup = qVar.K;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            qVar.K.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = qVar.K;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (iC != 0) {
            iE = iC;
        } else if (i != 0) {
            iE = i != 4097 ? i != 8194 ? i != 8197 ? i != 4099 ? i != 4100 ? -1 : z4 ? e(context, android.R.attr.activityOpenEnterAnimation) : e(context, android.R.attr.activityOpenExitAnimation) : true != z3 ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter : z4 ? e(context, android.R.attr.activityCloseEnterAnimation) : e(context, android.R.attr.activityCloseExitAnimation) : true != z3 ? R.animator.fragment_close_exit : R.animator.fragment_close_enter : true != z3 ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
        }
        if (iE != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iE));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iE);
                    if (animationLoadAnimation != null) {
                        return new awy(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iE);
                    if (animatorLoadAnimator != null) {
                        return new awy(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iE);
                    if (animationLoadAnimation2 != null) {
                        return new awy(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static void d(Object obj) throws NoSuchFieldException {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            d = true;
        }
        Class cls = c;
        if (cls == null) {
            return;
        }
        if (!f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                longSparseArray = (LongSparseArray) field.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                longSparseArray = null;
            }
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
        }
    }

    private static int e(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void m(View view, float f2) {
        try {
            view.setFrameContentVelocity(f2);
        } catch (LinkageError unused) {
        }
    }

    public static void r(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        jy jyVar = jy.a;
        if (jyVar != null && jyVar.c == view) {
            jy.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new jy(view, charSequence);
            return;
        }
        jy jyVar2 = jy.b;
        if (jyVar2 != null && jyVar2.c == view) {
            jyVar2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static int s(ix ixVar, AbstractC0001if abstractC0001if, View view, View view2, in inVar, boolean z) {
        if (inVar.al() == 0 || ixVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(in.bp(view) - in.bp(view2)) + 1;
        }
        return Math.min(abstractC0001if.k(), abstractC0001if.a(view2) - abstractC0001if.d(view));
    }

    public static int t(ix ixVar, AbstractC0001if abstractC0001if, View view, View view2, in inVar, boolean z, boolean z2) {
        if (inVar.al() == 0 || ixVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (ixVar.a() - Math.max(in.bp(view), in.bp(view2))) - 1) : Math.max(0, Math.min(in.bp(view), in.bp(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0001if.a(view2) - abstractC0001if.d(view)) / (Math.abs(in.bp(view) - in.bp(view2)) + 1))) + (abstractC0001if.j() - abstractC0001if.d(view)));
        }
        return iMax;
    }

    public static int u(ix ixVar, AbstractC0001if abstractC0001if, View view, View view2, in inVar, boolean z) {
        if (inVar.al() == 0 || ixVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return ixVar.a();
        }
        return (int) (((abstractC0001if.a(view2) - abstractC0001if.d(view)) / (Math.abs(in.bp(view) - in.bp(view2)) + 1)) * ixVar.a());
    }

    public static int v(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    public static Shader.TileMode w(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static List x(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static void y(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int z(Context context, String str) {
        int iE;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int iMyUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            iE = F(appOpsManager, strPermissionToOp, Binder.getCallingUid(), packageName);
            if (iE == 0) {
                iE = F(appOpsManager, strPermissionToOp, iMyUid, context.getOpPackageName());
            }
        } else {
            iE = E(context, strPermissionToOp, packageName);
        }
        return iE != 0 ? -2 : 0;
    }

    public boolean b(TextView textView) {
        return ((Boolean) gp.d(textView, "getHorizontallyScrolling", false)).booleanValue();
    }

    public void i(Canvas canvas) {
        throw null;
    }

    public void n() {
        throw null;
    }

    public EdgeEffect o(RecyclerView recyclerView) {
        throw null;
    }

    public ii(byte[] bArr, short[] sArr) {
    }

    public void c(RecyclerView recyclerView) {
    }

    public void p(Window window) {
    }

    public void a(StaticLayout.Builder builder, TextView textView) {
    }

    public void q(kx kxVar, kx kxVar2, Window window, View view, boolean z, boolean z2) {
    }
}
