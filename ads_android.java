public boolean isOnline() {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process ipProcess = runtime.exec("/system/bin/ping -c 1 8.8.8.8");
            int     exitValue = ipProcess.waitFor();
            return (exitValue == 0);
        }
        catch (IOException e)          { e.printStackTrace(); }
        catch (InterruptedException e) { e.printStackTrace(); }

        return false;
    }



*/*

                                    if (interstitialAd.isAdLoaded()) {
                                        showInterstitialFB(result);
                                    } else {
                                        if(isOnline()){
                                            loadAdsFB();
////                                            Toast.makeText(MainActivity.this, "Please wait for the ad to finish loading." , Toast.LENGTH_SHORT).show();
                                        } else {
                                            result.success(false);
                                        }
                                    }
