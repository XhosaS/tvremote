package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjr implements ComponentCallbacks2 {
    private static volatile hjr f;
    private static volatile boolean g;
    public final hod a;
    public final hjv b;
    public final List c = new ArrayList();
    public final hok d;
    public final hur e;
    private final how h;
    private final huh i;

    public hjr(Context context, moz mozVar, how howVar, hod hodVar, hok hokVar, huh huhVar, hur hurVar, int i, Map map, List list, List list2, hfx hfxVar) {
        this.a = hodVar;
        this.d = hokVar;
        this.h = howVar;
        this.i = huhVar;
        this.e = hurVar;
        this.b = new hjv(context, hokVar, new hkc(this, list2), new hju(), map, list, mozVar, hfxVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:12:0x001b, B:14:0x0031, B:16:0x0041, B:19:0x0046, B:20:0x0050, B:22:0x0056, B:24:0x006a, B:31:0x0084, B:33:0x008f, B:34:0x0098, B:36:0x009e, B:38:0x00ae, B:39:0x00b2, B:40:0x00b8, B:42:0x00be, B:43:0x00c6, B:47:0x00f5, B:49:0x0119, B:51:0x0125, B:50:0x0120, B:27:0x0073, B:29:0x007b), top: B:65:0x001b, outer: #2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be A[Catch: all -> 0x0180, LOOP:2: B:40:0x00b8->B:42:0x00be, LOOP_END, TryCatch #0 {all -> 0x0180, blocks: (B:12:0x001b, B:14:0x0031, B:16:0x0041, B:19:0x0046, B:20:0x0050, B:22:0x0056, B:24:0x006a, B:31:0x0084, B:33:0x008f, B:34:0x0098, B:36:0x009e, B:38:0x00ae, B:39:0x00b2, B:40:0x00b8, B:42:0x00be, B:43:0x00c6, B:47:0x00f5, B:49:0x0119, B:51:0x0125, B:50:0x0120, B:27:0x0073, B:29:0x007b), top: B:65:0x001b, outer: #2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:12:0x001b, B:14:0x0031, B:16:0x0041, B:19:0x0046, B:20:0x0050, B:22:0x0056, B:24:0x006a, B:31:0x0084, B:33:0x008f, B:34:0x0098, B:36:0x009e, B:38:0x00ae, B:39:0x00b2, B:40:0x00b8, B:42:0x00be, B:43:0x00c6, B:47:0x00f5, B:49:0x0119, B:51:0x0125, B:50:0x0120, B:27:0x0073, B:29:0x007b), top: B:65:0x001b, outer: #2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:12:0x001b, B:14:0x0031, B:16:0x0041, B:19:0x0046, B:20:0x0050, B:22:0x0056, B:24:0x006a, B:31:0x0084, B:33:0x008f, B:34:0x0098, B:36:0x009e, B:38:0x00ae, B:39:0x00b2, B:40:0x00b8, B:42:0x00be, B:43:0x00c6, B:47:0x00f5, B:49:0x0119, B:51:0x0125, B:50:0x0120, B:27:0x0073, B:29:0x007b), top: B:65:0x001b, outer: #2, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.hjr b(android.content.Context r29) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjr.b(android.content.Context):hjr");
    }

    public static hkg c(Context context) {
        return d(context).b(context);
    }

    public static huh d(Context context) {
        a.ar(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).i;
    }

    private static GeneratedAppGlideModule g(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                return null;
            }
            return null;
        } catch (IllegalAccessException e) {
            h(e);
            return null;
        } catch (InstantiationException e2) {
            h(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            h(e3);
            return null;
        } catch (InvocationTargetException e4) {
            h(e4);
            return null;
        }
    }

    private static void h(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.b.getBaseContext();
    }

    public final void e() {
        hwp.g();
        this.h.e();
        this.a.c();
        this.d.b();
    }

    public final void f(int i) {
        hwp.g();
        List<hkg> list = this.c;
        synchronized (list) {
            for (hkg hkgVar : list) {
            }
        }
        Object obj = this.h;
        if (i >= 40) {
            ((hwl) obj).e();
        } else if (i >= 20) {
            hwl hwlVar = (hwl) obj;
            hwlVar.j(hwlVar.f() / 2);
        } else if (i == 15) {
            i = 15;
            hwl hwlVar2 = (hwl) obj;
            hwlVar2.j(hwlVar2.f() / 2);
        }
        this.a.e(i);
        this.d.d(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        e();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        f(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
