GestureDetector(
                      onTap: (){
                        platform.invokeMethod('showInter').then((value) {
                          if(value){
                            _chewieController.dispose();
                            _videoPlayerController1.pause();
                            _videoPlayerController1.seekTo(Duration(seconds: 0));
                            _chewieController = ChewieController(
                              videoPlayerController: _videoPlayerController1,
                              aspectRatio: 3 / 2,
                              autoPlay: true,
                              looping: false,
                            );
                          } else {
                            platform.invokeMethod('toast',
                                {'toast_text': "Please check your network connection status!"});
                          }
                        });
                      },
                      child: Image.asset(
                        "assets/images/watch_again.png",
                        height: 40,
                        width: 40 * 3.3,
                      ),
                    )
