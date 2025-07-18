package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public class by extends fl {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final dvl mFragmentLifecycleRegistry;
    final cb mFragments;
    boolean mResumed;
    boolean mStopped;

    public by() {
        this.mFragments = new cb(new bx(this));
        this.mFragmentLifecycleRegistry = new dvl(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        int i = 1;
        getSavedStateRegistry().b(LIFECYCLE_TAG, new cf(this, i));
        addOnConfigurationChangedListener(new bw(this, i));
        addOnNewIntentListener(new bw(this, 0));
        addOnContextAvailableListener(new ff(this, 1));
    }

    private static boolean markState(cr crVar, dvd dvdVar) {
        boolean zMarkState = false;
        for (bv bvVar : crVar.j()) {
            if (bvVar != null) {
                if (bvVar.getHost() != null) {
                    zMarkState |= markState(bvVar.getChildFragmentManager(), dvdVar);
                }
                dh dhVar = bvVar.mViewLifecycleOwner;
                if (dhVar != null && ((dvl) dhVar.getLifecycle()).b.a(dvd.d)) {
                    bvVar.mViewLifecycleOwner.a.f(dvdVar);
                    zMarkState = true;
                }
                if (bvVar.mLifecycleRegistry.b.a(dvd.d)) {
                    bvVar.mLifecycleRegistry.f(dvdVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return ((cd) this.mFragments.a).e.d.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String strConcat = String.valueOf(str).concat("  ");
            printWriter.print(strConcat);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                dxr.a(this).d(strConcat, printWriter);
            }
            this.mFragments.a().F(str, fileDescriptor, printWriter, strArr);
        }
    }

    public cr getSupportFragmentManager() {
        return this.mFragments.a();
    }

    @Deprecated
    public dxr getSupportLoaderManager() {
        return dxr.a(this);
    }

    /* renamed from: lambda$init$0$android-support-v4-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ Bundle m80lambda$init$0$androidsupportv4appFragmentActivity() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.e(dvc.ON_STOP);
        return new Bundle();
    }

    /* renamed from: lambda$init$1$android-support-v4-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m81lambda$init$1$androidsupportv4appFragmentActivity(Configuration configuration) {
        this.mFragments.b();
    }

    /* renamed from: lambda$init$2$android-support-v4-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m82lambda$init$2$androidsupportv4appFragmentActivity(Intent intent) {
        this.mFragments.b();
    }

    /* renamed from: lambda$init$3$android-support-v4-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m83lambda$init$3$androidsupportv4appFragmentActivity(Context context) {
        Object obj = this.mFragments.a;
        cd cdVar = (cd) obj;
        cdVar.e.n(cdVar, (ca) obj, null);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), dvd.c)) {
        }
    }

    @Override // defpackage.fl, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.b();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.fl, defpackage.ds, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(dvc.ON_CREATE);
        ((cd) this.mFragments.a).e.s();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ((cd) this.mFragments.a).e.t();
        this.mFragmentLifecycleRegistry.e(dvc.ON_DESTROY);
    }

    @Override // defpackage.fl, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((cd) this.mFragments.a).e.U(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        ((cd) this.mFragments.a).e.z();
        this.mFragmentLifecycleRegistry.e(dvc.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // defpackage.fl, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.b();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.b();
        super.onResume();
        this.mResumed = true;
        this.mFragments.c();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(dvc.ON_RESUME);
        ((cd) this.mFragments.a).e.B();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.b();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            ((cd) this.mFragments.a).e.q();
        }
        this.mFragments.c();
        this.mFragmentLifecycleRegistry.e(dvc.ON_START);
        ((cd) this.mFragments.a).e.C();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.b();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        ((cd) this.mFragments.a).e.E();
        this.mFragmentLifecycleRegistry.e(dvc.ON_STOP);
    }

    public void setEnterSharedElementCallback(cry cryVar) {
        setEnterSharedElementCallback(cryVar != null ? new crc() : null);
    }

    public void setExitSharedElementCallback(cry cryVar) {
        setExitSharedElementCallback(cryVar != null ? new crc() : null);
    }

    public void startActivityFromFragment(bv bvVar, Intent intent, int i) {
        startActivityFromFragment(bvVar, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(bv bvVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
        } else {
            bvVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    public void startActivityFromFragment(bv bvVar, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            bvVar.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public by(int i) {
        super(i);
        this.mFragments = new cb(new bx(this));
        this.mFragmentLifecycleRegistry = new dvl(this);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(bv bvVar) {
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
